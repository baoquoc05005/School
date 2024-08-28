import java.util.Scanner;

public class Rent {
    private double[][] rentBasedOnFloorAndBedrooms;
    private Tenant tenant;

    // Constructor initializes rent table and Tenant object
    public Rent(){
        // Rent table based on floor and number of bedrooms
        rentBasedOnFloorAndBedrooms = new double[][]{
            {500, 600, 700},
            {650, 750, 850},
            {800, 900, 1000},
            {950, 1050, 1150},
            {1100, 1200, 1300}
        };
        // Initialize Tenant object
        tenant = new Tenant();
    }

    // Getter for Tenant object
    public Tenant getTenant(){
        return tenant;
    }

    // Method to calculate rent based on floor and number of bedrooms
    private double calculateRent(){
        // Get index for rent table based on floor number and subtract 1 for array index
        int floor = tenant.getFloorNum() - 1;
        // Get number of bedrooms for rent calculation
        int beds = tenant.getNumberOfBeds();
        // Return rent amount from rent table based on floor and number of bedrooms
        return rentBasedOnFloorAndBedrooms[floor][beds];
    }

    // Method to read tenant information from input using Scanner
    public void read(Scanner scan){
        System.out.print("Enter your name: ");
        // Read entire line for name input
        String name = scan.nextLine();
        // Trim any leading or trailing spaces and set name in Tenant object
        tenant.setName(name.trim());
        
        System.out.print("Enter floor and number of bedrooms: ");
        // Read floor number and number of bedrooms inputs
        tenant.setFloorNum(scan.nextInt());
        tenant.setNumberOfBeds(scan.nextInt());
    }

    // Override toString() method to return Rent information
    @Override
    public String toString(){
        return tenant.toString() + "\nRent = $" + this.calculateRent() + " per month";
    }

    // Override equals() method to compare two Rent objects
    @Override
    public boolean equals(Object o){
        // I check if object is an instance of Tenant
        if (o instanceof Tenant) {
            // If correct, I cast object to Tenant and compare floor number and number of bedrooms
            return this.tenant.getFloorNum() == ((Tenant)o).getFloorNum() &&
                   this.tenant.getNumberOfBeds() == ((Tenant)o).getNumberOfBeds();
        }
        //If not, it return false
        return false;
    }
}
