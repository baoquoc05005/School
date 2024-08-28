import java.util.Scanner;

public class ResizableArray {
    private int[] array;
    //Constructs a ResizableArray with a specified size
    public ResizableArray(int size) {
        array = new int[size];
    }
    //Reads integers from the user to populate the array.
    public void push() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + array.length + " numbers:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
    }
    //Inserts a number at the specified index using ArrayUtility's addAt method.
    public void insertElement(int index, int number) {
        array = ArrayUtility.addAt(array, index, number);
    }
    //Deletes the first occurrence of a number using ArrayUtility's delete method.
    public void deleteElement(int number) {
        array = ArrayUtility.delete(array, number);
    }
    //Provides a string representation of the array elements.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append("Element[").append(i).append("]: ").append(array[i]).append("\n");
        }
        return sb.toString().trim();
    }
}
