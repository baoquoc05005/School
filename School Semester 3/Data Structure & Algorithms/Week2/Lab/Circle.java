
// This class implement Shape interface and define getColor() and getArea() methods of Circle shape.
public class Circle implements Shape {
    //Initialize the radius and color of circle
    private double radius;
    private String color;
    //Constructor to initialize radius and color of circle
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    //Return color and area of circle
    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }
}
