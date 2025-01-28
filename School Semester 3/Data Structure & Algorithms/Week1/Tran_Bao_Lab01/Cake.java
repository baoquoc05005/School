// Abstract class Cake
public abstract class Cake {
    private String name;
    private double price;

    // Constructor
    public Cake(String name, double price) {
        this.name = name;
        this.price = price;
    }

    
    // Getters
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    // Abstract method to calculate price
    public abstract double calculatePrice();
}
