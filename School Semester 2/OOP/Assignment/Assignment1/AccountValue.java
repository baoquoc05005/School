class AccountValue {
    // I declare saving, annual Interest Rate and number of months
    private double savings;
    private double annualInterestRate;
    private int numMonths;
     // This is Setter or mutator method - changes value of a field. 
    // I sets the savings, annual interest rate and number of months if it is greater than 0
    public void setSavings(double savings) {
        if (savings > 0)
            this.savings = savings;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        if (annualInterestRate > 0)
            this.annualInterestRate = annualInterestRate;
    }
    public void setNumMonths(int numMonths) {
        if (numMonths > 0)
            this.numMonths = numMonths;
    }

    // Then I create these method(getSavings,...) or call "Getter" to retrieves the value of a field
    // Return  the savings, annual interest rate and number of months
    public double getSavings() {
        return savings;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public int getNumMonths() {
        return numMonths;
    }

    // This is the method to calculates the growth of the account over a specified number of months
    public double calculateGrowth(int months) {
        if (months <= 0) return savings; // If months is 0 or negative, return the initial savings
        double growth = 0; // Initialize growth to 0
        for (int month = 1; month <= months; month++) {
            growth += savings; // For every month pass, I add the monthly savings to growth
            growth = growth * (1 + annualInterestRate / 1200); // Then I apply the monthly interest rate to calculate the growth
        }
        return growth; // Return the calculated growth
    }

    //This part will returns the account details and the growth over time
    @Override
    public String toString() {
        String desc = "Monthly Saving Amount: " + getSavings() + "\n";
        desc += "Annual interest rate, in percent: " + getAnnualInterestRate() + "%\n";
        desc += "Number of Months: " + getNumMonths() + "\n\n";

        desc += String.format("%-8s%-10s\n", "Months", "Account Value");
        desc += String.format("%-8s%-10s\n", "------", "-------------");
        for (int month = 0; month <= getNumMonths(); month++) { //I make it loop through every month to display the account value over time
            // This will append the month and the corresponding account value to the console
            desc += String.format("%-8d%-10.3f\n", month, calculateGrowth(month));
        }
        return desc; // Return the full description
    }
    }