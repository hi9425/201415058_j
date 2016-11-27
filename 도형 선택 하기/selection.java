package com.sd.ch8;
import java.util.ArrayList;
public class selection{
    ArrayList<Rectangle> sarr=new ArrayList<Rectangle>();

    public void select(Rectangle r){
        r.setSelected(true);
        sarr.add(r);
        System.out.println("selected ! "+r.getSelected());
    }
    public void print(){
        for(Rectangle r:sarr)
            System.out.println(r.toString());
    }
    public static void main(String[] args){
        selection s=new selection();
        Rectangle r=new Rectangle(10.0,20.0);
        Cube c=new Cube(10.0,20.0,30.0);
        s.select(r);
        s.select(c);
        s.print();

    }


}