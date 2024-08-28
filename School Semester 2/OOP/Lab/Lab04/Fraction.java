import java.util.Scanner;

public class Fraction {
    private double numerator, denominator;

    public Fraction() {
        numerator = 1;
        denominator = 1;
    }

    public Fraction(double newNum, double newDen) {
        numerator = newNum;
        denominator = newDen;
    }

    public double getNumerator() {
        return numerator;
    }

    public void setNumerator(double numerator) {
        this.numerator = numerator;
    }

    public double getDenominator() {
        return denominator;
    }

    public void setDenominator(double denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            System.out.println("Denominator cannot be 0");
        }
    }

    public void inputNumerator(Scanner scan) {
        System.out.print("Please enter numerator: ");
        setNumerator(scan.nextDouble());
    }

    public void inputDenominator(Scanner scan) {
        double num = 0;
        do {
            System.out.print("Please enter denominator: ");
            num = scan.nextDouble();
            setDenominator(num);
        } while (num == 0);
    }

    public double getDecimal() {
        return numerator / denominator;
    }
    /*------------------------------------------------------------- */

    public Fraction addFractions(Fraction other) {
        double newNumerator = (this.numerator * other.getDenominator()) + (this.denominator * other.getNumerator());
        double newDenominator = this.denominator * other.getDenominator();
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiplyFractions(Fraction other) {
        double newNumerator = this.numerator * other.getNumerator();
        double newDenominator = this.denominator * other.getDenominator();
        return new Fraction(newNumerator, newDenominator);
    }
    /*--------------------------------------------------------------- */
    @Override
    public String toString() {
        return "The fraction's numerator is: " + getNumerator() +
                ",\ndenominator is: " + getDenominator() +
                "\nand decimal version of fraction is: " + getDecimal();
    }
}
