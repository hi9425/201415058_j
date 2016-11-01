import ch.aplu.turtle.*;

public class TwoTwo{
	Turtle t1 = new Turtle();
	enum Shape {TRIANGLE, SQUARE};
	public void draw(int size,int sides,double angle){
    t1.setHeading(90);
		for(int i=0;i<sides;i++){
			t1.fd(size);
			t1.left(angle);
		}
	}
	public static void main(String[] args){
		TwoTwo t = new TwoTwo();
		Shape sel = Shape.SQUARE;
		int size = 100;
		int sides = 0;
		double angle = 0.0;
		switch(sel) {
			case TRIANGLE:
				sides = 3;
				angle = 120.0;
				break;
			case SQUARE:
				sides = 4;
				angle = 90.0;
				break;
		}
		t.draw(size,sides,angle);
	}
}