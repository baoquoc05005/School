public class StringUtility {
    
    // This is method to capitalize the first letter of a string
    public static String beginWithUpperCase(String toConvert) {
        // This will check if input string is null or empty
        if (toConvert == null || toConvert.isEmpty()) {
            return "";  // Return empty string if input is null or empty
        }
        // Otherwise, it capitalize first letter and convert the rest to lowercase
        return toConvert.substring(0, 1).toUpperCase() + toConvert.substring(1).toLowerCase();
    }
}
