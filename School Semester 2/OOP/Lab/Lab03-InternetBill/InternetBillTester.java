import java.util.Scanner;

public class InternetBillTester {
    public static void main(String[] args) {
        // Create and initialize a Scanner
        Scanner scanner = new Scanner(System.in);

        // Create an object of InternetBill class using constructor
        InternetBill internetBill = new InternetBill();

        // I call the newly added method takeInput() from internetBill to get user input
        internetBill.takeInput(scanner);

        // I print the details and total charges
        System.out.println(internetBill);

        scanner.close();
    }
}
