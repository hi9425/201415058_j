import ch.aplu.turtle.*;

Turtle t1 = new Turtle();
class Triangle{
	void Triangle(int size){
		for(int i=0; i<3; i++){
			t1.fd(size);
			t1.right(120);
		}
	}
}
Triangle TT = new Triangle();
TT.Triangle(50);