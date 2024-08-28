import java.util.Scanner;

public class InternetBill {
    // I declared 3 constants to holding price for specific internet packages
    private static final double PACKAGE_A_PRICE = 49.99;
    private static final int PACKAGE_A_ALLOWED_GB = 200;
    private static final double PACKAGE_A_EXTRA_COST_PER_GB = 3.00;

    private static final double PACKAGE_B_PRICE = 39.99;
    private static final int PACKAGE_B_ALLOWED_GB = 125;
    private static final double PACKAGE_B_EXTRA_COST_PER_GB = 1.50;

    private static final double PACKAGE_C_PRICE = 24.99;
    private static final int PACKAGE_C_ALLOWED_GB = 25;
    private static final double PACKAGE_C_EXTRA_COST_PER_GB = 5.00;

    private static final double PACKAGE_D_PRICE = 69.99;

    //Private attributes of InternetBill class based on the requirement
    private String customerName;
    private String sPackName;
    private char cPackName;
    private int usage;

    // default constructor
    public InternetBill() {
        this.customerName = "";
        this.sPackName = "";
        this.cPackName = ' ';
        this.usage = 0;
    }

    // 2nd constructor
    public InternetBill(String newName, char newPack, int newUsage) {
        this.customerName = newName;
        this.cPackName = newPack;
        this.usage = newUsage;
        this.sPackName = getSPackName();
    }

    // I create these method(gerCustomerName,...) or call "Getter" to retrieves the value of a field
    public String getCustomerName() {
        return customerName;
    }

    // I link package character(A/B/C/D) to package name
    public String getSPackName() {
        switch (Character.toUpperCase(cPackName)) {
            case 'A':
                return "IGNITE_60";
            case 'B':
                return "IGNITE_30";
            case 'C':
                return "INTERNET_5";
            case 'D':
                return "UNLIMITED_USAGE";
            default:
                return "UNKNOWN_PACKAGE";
        }
    }

    public int getUsage() {
        return usage;
    }

    // This is Setter or mutator method - changes value of a field. 
    public void setCustomerName(String newName) {
        this.customerName = newName;
    }

    public void setCPackName(char newPack) {
        this.cPackName = newPack;
        this.sPackName = getSPackName();
    }

    public void setUsage(int newUsage) {
        this.usage = newUsage;
    }

    // I calculate total charges bill based on allowder usage limit
    private double charges(int allowedGB, double extraCharge, double packPrice) {
        if (usage > allowedGB) {                                 //If usage is greater than the limit
            int extraUsage = usage - allowedGB;                  //I calculate the exceeding usage
            return packPrice + (extraUsage * extraCharge);       //And I calculate extra charge (per GB) plus the bill of package
        } else {                                                 //If everything is fine
            return packPrice;                                    //I return the price normally
        }
    }

    //This is usage cost
    public double usageCost() {     
        //I initialized these variable and set to 0                        
        double price = 0;
        int allowed = 0;
        double extraCost = 0;

        switch (Character.toUpperCase(cPackName)) {            //For each cases, I set price, allowed and extra cost to the constans internet package I have initialized before 
            case 'A':
                price = PACKAGE_A_PRICE;
                allowed = PACKAGE_A_ALLOWED_GB;
                extraCost = PACKAGE_A_EXTRA_COST_PER_GB;
                break;
            case 'B':
                price = PACKAGE_B_PRICE;
                allowed = PACKAGE_B_ALLOWED_GB;
                extraCost = PACKAGE_B_EXTRA_COST_PER_GB;
                break;
            case 'C':
                price = PACKAGE_C_PRICE;
                allowed = PACKAGE_C_ALLOWED_GB;
                extraCost = PACKAGE_C_EXTRA_COST_PER_GB;
                break;
            case 'D':
                price = PACKAGE_D_PRICE;
                break;
        }

        if (cPackName == 'D' || cPackName == 'd') {           //If the package is D, I directly return the fixed prize bc the pack is unlimited usage
            return price;
        } else {
            return charges(allowed, extraCost, price);       //If the package is a,b,c, these variable(allowed, extraCost, price) will be pass to charges method to calculate if user usage is greater than usage limit or not
        }
    }

    // Method to get user input
    public void takeInput(Scanner scan) {
        System.out.print("Enter the name of customer: ");                 //I ask for customer name
        customerName = scan.nextLine();

        System.out.print("Enter your package letter (A/B/C/D): ");        //Then asking option they want to choose
        String packageInput = scan.next();
        cPackName = packageInput.charAt(0);

        if (Character.toUpperCase(cPackName) != 'D') {                    //If not D(unlimited usage), I will promot user usage input
            System.out.print("Please enter the usage (in GB): ");
            usage = scan.nextInt();
        }
    }

    @Override
    public String toString() {
        String result = customerName + " has purchased the " + getSPackName() + " internet package"; //I display customer name, package name, usage
        if (Character.toUpperCase(cPackName) != 'D') {
            result += "\nThe usage for this month is " + usage + " GB"; //If the package is not D(Unlimited usage), I just display GB usage of customer for specific field
        }
        result += String.format("\nCurrent Bill: $%.2f", usageCost()); //And return current bill
        return result;
    }
}
