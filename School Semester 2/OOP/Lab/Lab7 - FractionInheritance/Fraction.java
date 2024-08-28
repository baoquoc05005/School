import java.util.Scanner;  

public class Fraction {
    private double numerator, denominator;  // Instance variables for numerator and denominator

    // Default constructor initializing fraction to 1/1
    public Fraction() {
        this(1, 1);
    }

    // Parameterized constructor initializing fraction to given numerator and denominator
    public Fraction(double numerator, double denominator) {
        this.setNumerator(numerator);
        this.setDenominator(denominator);
    }

    // Getter for numerator
    public double getNumerator() {
        return numerator;
    }

    // Setter for numerator
    public void setNumerator(double numerator) {
        this.numerator = numerator;
    }

    // Getter for denominator
    public double getDenominator() {
        return denominator;
    }

    // Setter method to check and prevent zero denominator
    public void setDenominator(double denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            System.out.println("Denominator cannot be 0");
        }
    }

/*---------------------------------------------------------------------------------------------------------------*/

    // Method to input numerator from user
    public void inputNumerator(Scanner scan) {
        System.out.print("Please enter numerator: ");
        setNumerator(scan.nextDouble());
    }

    // Method to input denominator from user with validation
    public void inputDenominator(Scanner scan) {
        double num = 0;
        do {
            System.out.print("Please enter denominator: ");
            num = scan.nextDouble();
            setDenominator(num);
        } while (num == 0);
    }

    // Method to get decimal representation of the fraction
    public double getDecimal() {
        return this.getNumerator() / this.getDenominator();
    }

    // Method to add another fraction to this fraction
    public Fraction add(Fraction other) {
        return new Fraction((this.getNumerator() * other.getDenominator()) + 
                            (this.getDenominator() * other.getNumerator()), 
                            (this.getDenominator() * other.getDenominator()));
    }

    // Method to multiply another fraction with this fraction
    public Fraction multiply(Fraction other) {
        return new Fraction((this.getNumerator() * other.getNumerator()), 
                            (this.getDenominator() * other.getDenominator()));
    }
/*---------------------------------------------------------------------------------------------------------------*/


    // This toString method provide string representation of the fraction
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " numerator is: " + getNumerator() +
               ",\ndenominator is: " + getDenominator() +
               "\nand decimal version of fraction is: " + String.format("%.2f", getDecimal()) + "\n";
    }
}
