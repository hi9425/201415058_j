package com.sd.Draw;
import ch.aplu.turtle.*;



public class tors{
    Turtle t1 = new Turtle();
    enum Shape {TRIANGLE, SQUARE};
    public void T_or_S(int size,int sides,double angle){
        t1.setHeading(90);
        for(int i=0;i<sides;i++){
            t1.fd(size);
            t1.left(angle);
        }
    }
    public static void main(String[] args){
        tors t = new tors();
        Shape sel = Shape.TRIANGLE;
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
        t.T_or_S(size,sides,angle);
    }
}