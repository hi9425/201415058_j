
public class Turtle_Mother {

   protected int limb=4;
   protected String food;

    public void setFood(String f)
    {
        this.food=f;

    }

   public void eat()
   {
       System.out.println("Turtles eat"+food);

   }

    void swim()
    {


    }


    public static void main(String[] args) {


        Turtle_Mother t= new Turtle_Mother();
        t.eat();
        t.setFood("맛난거");
        seaTurtle st=new seaTurtle();
        landTurtle lt=new landTurtle();

        lt.setFood("나무");
        lt.eat();
        lt.swim();



    }


}


