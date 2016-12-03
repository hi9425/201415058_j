package com.sh.classJava;

/**
 * Created by seunghunlee on 2016. 11. 30..
 */
public class Rect extends Shape {

    public double calcArea()
    {
        return this.area;
    }

    public double calcPerimeter(){

        return this.perimeter;
    }

    public Rect(double w,double h)
    {
        this.width=w;
        this.height=h;
        this.area=w*h;
        this.perimeter=2*(w+h);
    }

    private double width;
    private double height;
    private double area;
    private double perimeter;

    public String toString()
    {
        return "Rect"+super.toString();
    }

}
