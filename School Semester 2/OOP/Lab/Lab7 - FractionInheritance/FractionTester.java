public class FractionTester {

    // Constructor to create and display fractions and mixed fractions
    public FractionTester() {
        // I creating a Fraction, 1st and 2nd MixedFraction object
        Fraction fraction = new Fraction(3, 5);  // Creating a Fraction object
        MixedFraction mixedFraction1 = new MixedFraction(1, 2, 6);  
        MixedFraction mixedFraction2 = new MixedFraction(2, 1, 4);  
        // Printing fraction details
        System.out.println(fraction);
        System.out.println(mixedFraction1);
        System.out.println(mixedFraction2);
    }

    // Main method to run the FractionTester
    public static void main(String[] args) {
        new FractionTester();  // This is create an instance of FractionTester
    }
}
