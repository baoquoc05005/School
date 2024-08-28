import java.util.Scanner;

public class Sales {
    //Attributes
    private String[] salesPeople;
    private double[] sales;

    // Constructor
    public Sales(int numberOfSalesPeople) {
        salesPeople = new String[numberOfSalesPeople];
        sales = new double[numberOfSalesPeople];
    }

    // I ask for use to enter information after prompting the numberOfSalesPeople
    public void enterInformation(Scanner scanner) {
        for (int i = 0; i < salesPeople.length; i++) {
            System.out.print("Enter name [" + (i + 1) + "]: ");
            salesPeople[i] = scanner.nextLine();
            System.out.print("Enter sales[" + (i + 1) + "]: ");
            sales[i] = scanner.nextDouble();
            scanner.nextLine();
        }
    }

    // This will calculate total sales
    public double calcTotalSales() {
        double totalSales = 0;
        for (double sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    // Method to calculate percentage
    public double calcPercentage(int index) {
        //If the index is out of range, it will be invalid | Else return the calculated % 
        if (index < 0 || index >= sales.length) {
            throw new IllegalArgumentException("Invalid index");
        }
        return (sales[index] / calcTotalSales()) * 100;
    }

    // Method to set commission
    public double setCommission(double sale) {
        if (sale <= 10999) {
            return sale * 0.005;        //If sales from 0 - 10999$, Commission is 0.5%
        } else if (sale <= 30999) {
            return sale * 0.01;         //If sales from 11000 - 30.999$, Commission is 1% 
        } else if (sale <= 50999) {
            return sale * 0.015;        //If sales from 40000 - 50.999$, Commission is 1.5%
        } else {
            return sale * 0.02;         //If higher than 50.999$, Commission is 2$
        }
    }

    // This is disply method( return Salesperson| sales made| Commission| %TotalSale)  |  Padding to the right is 25 spaces
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(StringUtility.padRight("Salesperson", 25))
              .append(StringUtility.padRight("Sales made", 25))
              .append(StringUtility.padRight("Commissions", 25))
              .append(StringUtility.padRight("Percentage of Total Sales", 25))
              .append("\n")
              .append("—".repeat(100))
              .append("\n");

        for (int i = 0; i < salesPeople.length; i++) {
            result.append(StringUtility.padRight(salesPeople[i], 25))
                  .append(StringUtility.padRight(String.format("$%.2f", sales[i]), 25))
                  .append(StringUtility.padRight(String.format("$%.2f", setCommission(sales[i])), 25))
                  .append(StringUtility.padRight(String.format("%.1f%%", calcPercentage(i)), 25))
                  .append("\n");
        }

        result.append("\nTotal sales were $")
              .append(String.format("%.2f", calcTotalSales()))
              .append("\n");

        return result.toString();
    }
    
    //This is the main method
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many sales people are there? ");
        int numberOfSalesPeople = scanner.nextInt();
        scanner.nextLine(); 

        Sales sales = new Sales(numberOfSalesPeople);
        sales.enterInformation(scanner);

        System.out.println(sales);
    }
}
