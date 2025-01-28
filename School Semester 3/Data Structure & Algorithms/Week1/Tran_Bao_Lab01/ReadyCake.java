// Subclass for Ready-made cakes

public class ReadyCake extends Cake {
    // Constructor
    public ReadyCake(String name, double price) {
        super(name, price);
    }

    //I Implement calculatePrice
    @Override
    public double calculatePrice() {
        return getPrice();
    }
}
