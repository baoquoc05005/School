import javax.swing.JOptionPane;

public class FractionTester {

    public FractionTester(){
        // I   ooooooooo]\\\\\\\\\\\Create two fraction objects
        Fraction fraction1 = new Fraction(3, 5);///       
        Fraction fraction2 = new Fraction(2, 7);

        // I Create two mixed fraction objects
        Fraction mixedFraction1 = new Fraction(7, 3);
        Fraction mixedFraction2 = new Fraction(5, 2);

        // I Put four objects in the array of Fraction objects
        Fraction[] fractions = { fraction1, fraction2, mixedFraction1, mixedFraction2 };

        // I Use a regular for loop to call the toString method for each fraction in the array
        System.out.println("Using regular for loop:");
        for (int i = 0; i < fractions.length; i++) {
            System.out.println(fractions[i].toString());
        }

        // I Use a for-each loop to call the toString method for each fraction in the array and display the results in a message box
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
