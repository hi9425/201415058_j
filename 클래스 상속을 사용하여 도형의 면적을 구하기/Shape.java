package com.sh.classJava;

public abstract class Shape {

    public String name="com.sh.classJava.Shape";

    public abstract double calcArea();

    public abstract double calcPerimeter();


    public String getName(){

        return this.name;
    }


    public String toString()
    {

        return "shape"+super.toString();
    }
}
