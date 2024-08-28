import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //I get the size from user
        System.out.println("Enter the original size of your array:");
        int size = scanner.nextInt();
        // Create a ResizableArray object with the size just received
        ResizableArray resizableArray = new ResizableArray(size);
        // Populate the array with user input
        resizableArray.push();
        
        System.out.println("Initial array:");
        System.out.println(resizableArray);
        
        // Prompt user for index and number to insert at that index
        System.out.println("Give the index and value to insert at that index:");
        System.out.print("Index: ");
        int index = scanner.nextInt();
        System.out.print("Number: ");
        int number = scanner.nextInt();
        
        // Insert the number at the specified index
        resizableArray.insertElement(index, number);
        
        System.out.println("Array after insertion:");
        System.out.println(resizableArray);
        
        // Prompt user for the number to delete from the array
        System.out.println("Enter the number to delete:");
        int numToDelete = scanner.nextInt();
        
        // Delete the number from the array
        resizableArray.deleteElement(numToDelete);
        
        System.out.println("Array after deletion:");
        System.out.println(resizableArray);
        
        scanner.close();
    }
}
