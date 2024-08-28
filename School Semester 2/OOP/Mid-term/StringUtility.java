public class StringUtility {
    public static String beginWithUpperCase(String toConvert) {
        return toConvert.substring(0, 1).toUpperCase() + toConvert.substring(1);
    }

    public static String padRight(String data, int spaces) {
        return String.format("%-" + spaces + "s", data);
    }
}
