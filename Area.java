package com.mycompany.mavenproject1;


public class Area {
    
    private double length;
    private double breadth;
    
    Area(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    
    public double returnArea(){
        double area=(this.length) * (this.breadth);
        return area;
    }
    
}
