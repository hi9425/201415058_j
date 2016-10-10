public class Dice {

    private int number=0;
    public int roll(){
        this.number =(int)(Math.random()*6);
        System.out.println("Turns on"+number);

        return number; /* 리턴을 해줘야 다른데서 쓸 수 있다.*/

    }


}
