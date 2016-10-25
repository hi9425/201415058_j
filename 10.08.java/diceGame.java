class diceGame
{
    private player p1;
    private player p2;
   public void beginGame() {

       p1=new player("승훈");
       p2=new player("훈승");

       p1.play();
       p2.play();

       if (p1.getNum()>p2.getNum()){
           System.out.println(p1.getNum()+"이김");
       }

       else if  (p1.getNum()<p2.getNum())
       {
           System.out.println(p2.getNum()+"이김");
       }

       else if
           (p1.getNum() == p2.getNum()){

           System.out.println("둘이 비김");
       }





    }
}
