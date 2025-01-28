
// This class implement Shape interface and define getColor() and getArea() methods of Square shape.
public class Square implements Shape {
    //Initialize radius and color of square
    private double side;
    private String color;
    //Constructor to initialize radius and color of square
    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }
    //Return color and area of square
    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
