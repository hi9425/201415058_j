import ch.aplu.turtle.*;

public class Baram {
	public void draw(int size,int sides,int bigger,double degree) {
		Turtle t1 = new Turtle();
		for (int i=0;i<sides;i++) {
			t1.fd(size);
			t1.right(degree);
			if(i%2!=0) {
				size+=bigger;
			}
		}
	}
	public static void main(String[] args) {
		Baram b = new Baram();
		int size = 7;
		int sides = 30;
		int bigger = 20;
		double degree = 90.0;
		b.draw(size,sides,bigger,degree);
	}
}