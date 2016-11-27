package com.sd.ch8;
import com.sd.ch8.Rectangle;

public class cube extends Rectangle{
    double height;
   public Cube(double l, double w, double h){
       super(l,w);
       this.height=h;

    }
    public double GetHeight(){
        return this.height;

    }

}