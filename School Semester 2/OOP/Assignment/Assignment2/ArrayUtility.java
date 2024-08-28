public class ArrayUtility {
    public static int[] addAt(int[] array, int index, int number) {
        // I check for zero element and let the user to insert the number there
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = number;
                return array;
            }
        }
        
        // Create a new array of larger size
        int[] newArray = new int[array.length + 1];
        
        // Copy elements to the new array
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = number;
        for (int i = index; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }
        
        return newArray;
    }

    public static int[] delete(int[] array, int number) {
        int indexToDelete = -1;
        
        // I find the index of the number to be deleted
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                indexToDelete = i;
                break;
            }
        }
        //If the number not found, I simply return the original array
        if (indexToDelete == -1) {
            return array;  
        }
        
        // Move elements up to fill the gap
        for (int i = indexToDelete; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        
        // I assign zero to the last element
        array[array.length - 1] = 0;
        
        return array;
    }
}
