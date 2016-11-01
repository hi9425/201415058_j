import ch.aplu.turtle.*;
import java.awt.geom.Point2D;

public class Square {
	public void draw(double x,double y,int size){
		Turtle t1 = new Turtle();
		t1.penUp();
		t1.setPos(x,y);
		t1.penDown();
		for(int i=0;i<4;i++){
			t1.fd(size);
			t1.right(90);
		}
	}
	public static void main(String[] args){
		Square s = new Square();
		Point2D p1 = new Point2D.Double(100.0,100.0);
		s.draw(p1.getX(),p1.getY(),50);
	}
}