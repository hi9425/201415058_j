class diceGame
{
    private player p1; /*원래는 player player= new player //이건데 비긴 게임 밑에 꺼라 이거랑 나*/
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
