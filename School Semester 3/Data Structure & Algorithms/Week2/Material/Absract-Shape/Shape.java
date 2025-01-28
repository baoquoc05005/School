/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeexample;

//Concrete class : Circle - 
// Abstract Class: Shape

 abstract public class Shape {
    private String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }   

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    abstract double getArea();
    
}
