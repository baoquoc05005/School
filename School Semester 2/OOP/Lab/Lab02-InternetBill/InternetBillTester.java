import java.util.Scanner;

public class InternetBillTester {
    public static void main(String[] args) {
        // I create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // This will prompt user for customer name
        System.out.print("Enter the name of customer: ");
        String customerName = scanner.nextLine();
        //package name
        System.out.print("Enter your package name: ");
        String packageName = scanner.nextLine();
        //usage
        System.out.print("Please enter the usage (in GB): ");
        int usage = scanner.nextInt();

        // Create InternetBill object using parameterized constructor
        InternetBill internetBill = new InternetBill(customerName, packageName, usage);

        // Show package and bill details on terminal
        System.out.println("\n" + internetBill.getCustomerName() + " has purchased the " + internetBill.getPackageName() + " internet package");
        System.out.println("The usage for this month is " + internetBill.getUsage() + " GB");
        System.out.printf("Current Bill: $%.2f\n", internetBill.usageCost());

        scanner.close();
    }
}
