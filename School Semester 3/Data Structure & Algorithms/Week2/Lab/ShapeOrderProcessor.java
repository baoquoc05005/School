
import java.util.ArrayList;
import java.util.Scanner;

public class ShapeOrderProcessor {
    public static void main(String[] args) {
        // Create a scanner to read input and an array list to store shapes
        Scanner scanner = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<>();
        // Prompt user to enter shapes and read input
        System.out.println("Enter the shapes (e.g., 'Circle 0.5 blue'). Type 'end' to finish:");

        while (true) {
            // I read the input from the user and check if it is 'end' to break the loop 
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            // Split input into parts and create a new shape object based on shape type
            String[] parts = input.split(" ");
            // I check if the input has 3 parts 
            if (parts.length == 3) {
                String shapeType = parts[0];
                double size = Double.parseDouble(parts[1]);
                String color = parts[2];

                //if true then create new shape object based on shape type and add it to shapes list
                if (shapeType.equalsIgnoreCase("Circle")) {
                    shapes.add(new Circle(size, color));
                } else if (shapeType.equalsIgnoreCase("Square")) {
                    shapes.add(new Square(size, color));
                }
            }
        }
        // Calculate total area of shapes of each color
        double redArea = 0;
        double greenArea = 0;
        double blueArea = 0;
        // I iterate over the shapes and add the area of each shape to the color
        for (Shape shape : shapes) {
            switch (shape.getColor().toLowerCase()) {
                case "red":
                    redArea += shape.getArea();
                    break;
                case "green":
                    greenArea += shape.getArea();
                    break;
                case "blue":
                    blueArea += shape.getArea();
                    break;
            }
        }
        // Lastly, print total area of shapes of each color and close scanner
        System.out.printf("Total area of red shapes: %.2f m²%n", redArea);
        System.out.printf("Total area of green shapes: %.2f m²%n", greenArea);
        System.out.printf("Total area of blue shapes: %.2f m²%n", blueArea);

        scanner.close();
    }
}
