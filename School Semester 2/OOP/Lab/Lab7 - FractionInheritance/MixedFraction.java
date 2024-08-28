public class MixedFraction extends Fraction {
    private int wholeNumber;  // Instance variable for whole number part of the mixed fraction

    // I initializing a mixed fraction with a parameterized constructor
    public MixedFraction(int wholeNumber, double numerator, double denominator) {
        super(numerator, denominator);  // Calling superclass constructor
        this.wholeNumber = wholeNumber;
    }

    // This getNumerator method convert mixed fraction to an improper fraction( this mean it only has numerator and denominator)
    @Override
    public double getNumerator() {
        return wholeNumber * getDenominator() + super.getNumerator();  // I convert mixed fraction to improper fraction
    }

    // This toString method provide string representation of the mixed fraction
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " numerator is: " + getNumerator() +
               ",\ndenominator is: " + getDenominator() +
               "\nand decimal version of fraction is: " + String.format("%.2f", getDecimal()) + "\n";
    }
}
