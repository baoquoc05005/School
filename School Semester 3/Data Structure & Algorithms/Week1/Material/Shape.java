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
public class Shape {
    private String color;
    private boolean filled;
    
    public Shape() {
        System.out.println("Shape - No-arg-Constructor ");
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        System.out.println("Shape -with-args-Constructor ");
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    double getArea(){
        return 0.0;    
    }
    @Override
    public String toString() {
        return "Shape{" + "color=" + color + ", filled=" + filled + '}';
    }
    
    
    
}
