// PositionChecker.java
import java.util.Scanner;

public class PositionChecker {

    public void position(int index) throws MyException {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException("Index cannot be negative");
        } else if (index > 100) {
            throw new MyException(index);
        } else {
            System.out.println("index:" + index);
        }
    }

    public static void main(String[] args) {
        PositionChecker checker = new PositionChecker();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the index\n");
        int index = scanner.nextInt();

        try {
            checker.position(index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}
