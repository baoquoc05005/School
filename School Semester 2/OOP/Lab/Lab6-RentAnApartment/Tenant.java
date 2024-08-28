public class Tenant {
    //Attributes
    private String name;
    private int floorNum;
    private int numberOfBeds;

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }
    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    // Getters
    public int getFloorNum() {
        return floorNum;
    }
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    // Method to get formatted name with first letter of each part capitalized
    public String getName() {
        // Split name into parts by space
        String[] parts = name.split(" ");
        // StringBuilder to build capitalized full name
        StringBuilder capitalizedFullName = new StringBuilder();
        // Loop through each part and capitalize first letter
        for (String part : parts) {
            capitalizedFullName.append(StringUtility.beginWithUpperCase(part)).append(" ");
        }
        // Convert StringBuilder to String and trim any trailing spaces
        return capitalizedFullName.toString().trim();
    }

    // Method to get type of apartment based on number of beds
    public String getApartmentType() {
        if (numberOfBeds == 0) {
            return "Studio apartment";
        } else if (numberOfBeds == 1) {
            return "1 bedroom apartment";
        } else if (numberOfBeds == 2) {
            return "2 bedroom apartment";
        } else {
            return numberOfBeds + " bedroom apartment";
        }
    }

    // Override toString() method to represent Tenant information
    @Override
    public String toString() {
        return getName() + " wants to rent " + getApartmentType() + " on floor number " + getFloorNum();
    }
}
