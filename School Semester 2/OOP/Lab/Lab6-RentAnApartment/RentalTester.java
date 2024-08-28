import java.util.Scanner;

public class RentalTester {

    // Constructor to run rental application
    public RentalTester(){
        // I create Rent object and Scanner object for input
        Rent rent = new Rent(); 
        Scanner scan = new Scanner(System.in);
        // Read tenant information using Rent object
        rent.read(scan);
        // Print rent details using toString() method
        System.out.println(rent);
    }

    // I create RentalTester object to run rental application through main method
    public static void main(String[] args) {
        new RentalTester();
    }
}
