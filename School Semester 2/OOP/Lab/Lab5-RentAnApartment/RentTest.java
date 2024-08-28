import java.util.Scanner;

public class RentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //I create rent class instance
        Rent rent = new Rent();
        //I ask for user input (name and floor number)
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter floor number:");
        int floorNumber = scanner.nextInt();

        rent.readTenantInfo(name, floorNumber);
        //Lastly, print all infomation to console
        System.out.println(rent);
    }
}
