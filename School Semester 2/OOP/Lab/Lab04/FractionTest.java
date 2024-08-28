import java.util.Scanner;

public class FractionTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // This is input for first fraction(old code)
        Fraction fracFirst = new Fraction();
        fracFirst.inputNumerator(scan);
        fracFirst.inputDenominator(scan);

        /*---------------------------------------------------------------- */
        // This is input for second fraction
        Fraction fracSecond = new Fraction();
        fracSecond.inputNumerator(scan);
        fracSecond.inputDenominator(scan);

        // Adding fractions and Multiply fractions
        Fraction sum = fracFirst.addFractions(fracSecond);
        System.out.println("\nAfter Fraction1 and Fraction2 are added:");
        System.out.println(sum);

        Fraction product = fracFirst.multiplyFractions(fracSecond);
        System.out.println("\nAfter Fraction1 and Fraction2 are multiplied:");
        System.out.println(product);
    }
}
