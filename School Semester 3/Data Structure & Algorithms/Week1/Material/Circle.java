/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance_app;

/**
 *
 * @author user
 */
public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        System.out.println("Circle without arg");
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        System.out.println("Circle with args");
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

    @Override
    public String toString() {
        //return "Circle{" + "radius=" + radius + '}' + super.getColor();
        return "Circle{" + "radius=" + radius + '}' + super.toString() ;
    }
    

  
    

    
    

   
   
}
