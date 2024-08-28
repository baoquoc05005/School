// MyException.java
public class MyException extends Exception {
    private int index;

    public MyException(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Index " + index + " is invalid";
    }
}
