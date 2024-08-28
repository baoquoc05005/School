import javax.swing.JOptionPane;

public class FractionTester {

    public FractionTester(){
        // I Create two fraction objects and two mixed fraction objects
        Fraction fraction1 = new Fraction(3, 5);
        Fraction fraction2 = new Fraction(2, 7);

        Fraction mixedFraction1 = new Fraction(1, 3, 4); // This means 1 3/4
        Fraction mixedFraction2 = new Fraction(2, 1, 2); //            2 1/2

        // Then I put all of them in the array of Fraction objects
        Fraction[] fractions = { fraction1, fraction2, mixedFraction1, mixedFraction2 };

        // Use a regular for loop to call the toString method for each fraction in array
        System.out.println("Using regular for loop:");
        for (int i = 0; i < fractions.length; i++) {
            System.out.println(fractions[i].toString());
        }

        // This is for-each loop to call toString method for each fraction in array and display results in the message box
        StringBuilder message = new StringBuilder("Using for-each loop:\n");
        for (Fraction fraction : fractions) {
            message.append(fraction.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, message.toString());
    }

    public static void main(String[] args) {
        new FractionTester();
    }
}
