public class StringUtility {
    //I create a static method which take a string as an argument(parameter) and return it
    public static String capitalizeFirstChar(String input) {
        if (input == null || input.isEmpty()) { //I check if the string is empty or null and will return it bc we can't modified if there's nothing in it
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1);  //If input is not empty, it convert first character into uppercase and return the whole thing
    }
}
