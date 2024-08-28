public class Rent {
    private static final double[] rentSchedule = {0, 500, 650, 800, 950, 1100};
    private Tenant tenant;
    //constructor
    public Rent() {
        tenant = new Tenant();
    }
    // I create a method to read tenant information
    public void readTenantInfo(String name, int floorNumber) {
        tenant.setName(name);
        tenant.setFloorNumber(floorNumber);
    }
    //This method will calculate the rent
    private double calculateRent() {
        int floor = tenant.getFloorNumber();
        if (floor >= 1 && floor <= 5) {
            return rentSchedule[floor];
        }
        return 0;
    }
    //Override toString to display the calculated rent per month
    @Override
    public String toString() {
        return tenant.toString() + "\nRent = $" + calculateRent() + " per month";
    }
}
