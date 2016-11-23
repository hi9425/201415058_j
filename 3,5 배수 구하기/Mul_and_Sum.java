class Mul_and_Sum{
    int sum = 0;
    void calc(int start, int end){
        for(int i=start; i<end; i++){
            if(i%3==0 || i%5==0) {
                sum = sum + i;
            }
        }
        System.out.printf("multiple 3 and 5 is : %d\n", sum);
    }
    public static void main(String[] args){
        Mul_and_Sum m = new Mul_and_Sum();
        int Start = 1;
        int End = 1000;
        m.calc(Start,End);
    }
} 