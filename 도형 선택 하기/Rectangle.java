package com.sd.ch8;
public class Rectangle{
    protected double width;
    protected double length;
    protected boolean isSelected;
    public Rectangle(double w,double l){
        this.length=l;
        this.width=w;

    }
    
    
    public double getWidth(){
        return this.width;
    }

    public double getLength(){
        return this.length;
    }
    
    
    public boolean getSelected(){
        return this.isSelected;
    }

    public void setSelected(boolean b){
        this.isSelected=b;
    }
    

}