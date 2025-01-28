// Main Application
public class BakeryApp {
    public static void main(String[] args) {
        // This is 20 polymorphic Cake objects
        Cake[] cakes = new Cake[20];

        // Hardcode for cakes (I do both ReadyCake and CustomCake)
        cakes[0] = new ReadyCake("Carrot Cake", 30);
        cakes[1] = new CustomCake("Bob's BD Cake", 40, 2.5, 15);
        cakes[2] = new ReadyCake("Chocolate Cake", 25);
        cakes[3] = new CustomCake("Wedding Cake", 50, 3, 20);
        cakes[4] = new ReadyCake("Strawberry Cake", 35);
        cakes[5] = new CustomCake("Anniversary Cake", 45, 1.5, 10);
        cakes[6] = new ReadyCake("Vanilla Cake", 28);
        cakes[7] = new CustomCake("Birthday Cake", 38, 2, 12);
        cakes[8] = new ReadyCake("Lemon Cake", 32);
        cakes[9] = new CustomCake("Custom Wedding Cake", 55, 4, 25);
        cakes[10] = new ReadyCake("Blueberry Cake", 29);
        cakes[11] = new CustomCake("Custom Cake", 42, 3, 18);
        cakes[12] = new ReadyCake("Pineapple Cake", 31);
        cakes[13] = new CustomCake("Graduation Cake", 48, 2, 14);
        cakes[14] = new ReadyCake("Coffee Cake", 27);
        cakes[15] = new CustomCake("Retirement Cake", 60, 5, 30);
        cakes[16] = new ReadyCake("Apple Cake", 33);
        cakes[17] = new CustomCake("Baby Shower Cake", 40, 1.8, 16);
        cakes[18] = new ReadyCake("Mango Cake", 36);
        cakes[19] = new CustomCake("New Year Cake", 50, 2.2, 20);

        // Calculate, show total price all cakes
        double totalPrice = 0;
        System.out.println("Cake Details:");
        for (Cake cake : cakes) {
            if (cake != null) { // I check for No empty slot in array
                double price = cake.calculatePrice();
                totalPrice += price;
                System.out.println(cake.getName() + " - Price: $" + price);
            }
        }
        System.out.println("Total Price for all cakes: $" + totalPrice);
    }
}
