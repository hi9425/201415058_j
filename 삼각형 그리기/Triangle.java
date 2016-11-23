class Triangle {
    void drawSq(){
        StringBuffer stringbuffer = new StringBuffer();
        String white =" ";
        String s="#";
        for (int i=0; i<6; i++ ) {
            for(int j=0;j<6-i;j++){
                stringbuffer.append(white);
            }
            for (int j=0; j<i*2+1; j++ ) {
                stringbuffer.append(s);
            }
            System.out.printf("%s\n",stringbuffer.toString());
            stringbuffer.delete(0,stringbuffer.length());
        }
    }
    public static void main(String[] args) {
        Triangle a = new Triangle();
        a.drawSq();
    }
}