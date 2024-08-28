import java.util.Scanner;

class TestAcccountValue {

    public static void main(String[] args) {
        // Create an instance of AccountValue
        AccountValue accountValue = new AccountValue();
        // Create and initialize a Scanner
        Scanner scanner = new Scanner(System.in);
        
        // I declare variables to store user inputs(savings, rate, month / savings, annualInterestRate, numMonths)
        double savings, rate;
        int months;
        
        // I ask for user input value for these variable after declare it
        System.out.println("Enter amount, interest rate and number of months");
        
        // Read the user's input for savings amount, interest rate, and number of months
        savings = scanner.nextDouble();
        rate = scanner.nextDouble();
        months = scanner.nextInt();
        
        // Then I set these value in the accountValue object
        accountValue.setSavings(savings);
        accountValue.setAnnualInterestRate(rate);
        accountValue.setNumMonths(months);
        
        System.out.println();

        // Last, I print the account details and growth over time to console
        System.out.println(accountValue);
    }
}
