
import ch.aplu.turtle.*;

public class Square {
	public void draw(int size) {
		Turtle t1 = new Turtle();
		for(int i=0;i<4;i++){
			t1.fd(size);
			t1.right(90);
		}
	}
	public static void main(String[] args){
		Square s = new Square();
		s.draw(200);
	}
}