public class Pizza {

    private String toppings;
    private double price;

    public Pizza (String newToppings, double newPrice) {
        toppings = newToppings;
        price = newPrice;
    }
    public String getToppings() {
        return toppings;
    }
    public double getPrice() {
        return price;
    }
    public void displayToppingsAndPrice() {
        System.out.println("\n----------------------------------------");
        System.out.print("  Price: " + getPrice());
        System.out.print("  Toppings: " + getToppings());
    }
}
