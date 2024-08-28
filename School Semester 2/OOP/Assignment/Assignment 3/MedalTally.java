import java.util.Scanner;

public class MedalTally {
    private static final int NUM_COUNTRIES = 15;
    private static final String[] countryNames = {
        "Australia", "England", "Canada", "India", "New Zealand", 
        "South Africa", "Nigeria", "Jamaica", "Scotland", "Kenya", 
        "Malaysia", "Singapore", "Wales", "Cyprus", "Bahamas"
    };
    private int[][] medals = new int[NUM_COUNTRIES][3];

    public void acceptInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter medals data with country code and medal count separated by commas, 0 when done: ");
            String input = scanner.nextLine();
            if (input.equals("0")) break;
            String[] data = input.split(",");
            int countryCode = Integer.parseInt(data[0]) - 1;
            int gold = Integer.parseInt(data[1]);
            int silver = Integer.parseInt(data[2]);
            int bronze = Integer.parseInt(data[3]);
            medals[countryCode][0] = gold;
            medals[countryCode][1] = silver;
            medals[countryCode][2] = bronze;
        }
        scanner.close();
    }

    public void displayMedalTally() {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("%-20s %10s %20s %20s%n", "Country", "Gold", "Silver", "Bronze");
        System.out.println("--------------------------------------------------------------------------------");
        for (int i = 0; i < NUM_COUNTRIES; i++) {
            if (medals[i][0] != 0 || medals[i][1] != 0 || medals[i][2] != 0) {
                System.out.printf("%-20s %10d %20d %20d%n", countryNames[i], medals[i][0], medals[i][1], medals[i][2]);
            }
        }
        System.out.println("####Medal Tally####");
        for (int i = 0; i < NUM_COUNTRIES; i++) {
            if (medals[i][0] != 0 || medals[i][1] != 0 || medals[i][2] != 0) {
                int totalMedals = rowTotal(medals, i);
                System.out.printf("%-20s %10d%n", countryNames[i], totalMedals);
            }
        }
    }

    public static int rowTotal(int[][] array, int rowIndex) {
        int total = 0;
        for (int col = 0; col < array[rowIndex].length; col++) {
            total += array[rowIndex][col];
        }
        return total;
    }
}
