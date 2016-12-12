import ch.aplu.turtle.*;

public class TurtleBack {
    static Turtle t1 = new Turtle();
    static Turtle t2 = new Turtle();
    public void ATurtle(double x1, double y1){
        t1.penUp();
        t1.setPos(x1,y1);
        t1.penDown();
        t1.setHeading(0);
    }
    public void ATurtle2(double x2, double y2){
        t2.penUp();
        t2.setPos(x2,y2);
        t2.penDown();
        t2.setHeading(0);
    }
    public void color1(){
        t1.setPenColor ("Black");
    }
    public void color2(){
        t2.setPenColor ("Gray");
    }
    public void go_(int x1){
        t1.fd(50*x1);
    }
    public void go__(int x2){
        t2.fd(50*x2);
    }
    public void back_Do(){
        t1.back(90);
    }
    public void back__Do(){
        t2.back(90);
    }
}