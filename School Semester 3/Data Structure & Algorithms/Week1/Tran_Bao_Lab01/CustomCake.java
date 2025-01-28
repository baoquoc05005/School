// Subclass for Custom cakes

public class CustomCake extends Cake {
    private double weight; // in kilograms
    private double customFee;

    // Constructor
    public CustomCake(String name, double pricePerKg, double weight, double customFee) {
        super(name, pricePerKg);
        this.weight = weight;
        this.customFee = customFee;
    }

    // I Implement calculatePrice
    @Override
    public double calculatePrice() {
        return (getPrice() * weight) + customFee;
    }
}
