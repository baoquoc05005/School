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
public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    double getArea() {
        return width*height;
    }

    @Override
    public String toString() {
        
        String st="\n---------------\n";
        st+=super.toString() +"\n";
        st+= "Rectangle{" + "width=" + width + ", height=" + height + '}';
        return st;
    }
    
    
}
