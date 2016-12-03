


public class Rectangle implements Ishape{
    private double width;
    private double height;
    private double area;
    private double perimeter;
    public Rectangle(double w,double h)
    {
        this.width=w;
        this.height=h;
        this.area=w*h;
        this.perimeter=2*(w+h);
    }
    public double calcArea()
    {
        return this.area;
    };
    public double calcPerimeter(){
        return this.perimeter;
    }


    public static void main(String[] args) {
        Rectangle r=new Rectangle(10.0,20.0);
    }
}
