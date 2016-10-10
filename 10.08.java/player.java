class player
{
    Dice d=new Dice();

   private String name = null;

    private int num=0;

    public player(String name){

        this.name = name;
    }

    public void play() {

        Dice di = new Dice();
        num = di.roll();
    }
        public int getNum(){


    return num;
}
