


package point;





public class Circle extends Point {


    private double radius;

    Circle(int x, int y, double radius)
    {
        this.x=x;
        this.y=y;
        this.radius=radius;
    }



    public double getArea()
    {

        double a=radius*radius;

        System.out.println("넓이 "+a+" 입니다.");
        return a;
    }


    public static void main(String[] args) {


        Circle c=new Circle(20,50,15.0);

        System.out.println(c.getArea());
        
    }
}
