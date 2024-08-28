public class Tenant {
    //two attributes – tenant name and floor number
    private String name;
    private int floorNumber;

    public Tenant() {}

    public Tenant(String name, int floorNumber) {
        this.name = name;
        this.floorNumber = floorNumber;
    }
    //I create getter and setter for the private fields(name and floor).
    public String getName() {
        return StringUtility.capitalizeFirstChar(name);  //I call the static method from the StringUtility class
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
    //Override toString to display user name and floor number
    @Override
    public String toString() {
        return getName() + " want to rent floor number " + floorNumber;
    }
}
