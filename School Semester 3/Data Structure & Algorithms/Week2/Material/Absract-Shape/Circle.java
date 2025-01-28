/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeexample;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {        
        this.radius = radius;
    }
    public Circle(double radius, String color) {
        super(color);        
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    double getArea() {
        return radius*radius*Math.PI;
        
    }
   
  
    
}
