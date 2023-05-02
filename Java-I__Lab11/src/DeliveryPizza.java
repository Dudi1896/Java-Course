public class DeliveryPizza extends Pizza {
    private final double determineDeliveryFee;
    private final String deliveryAddress;

    public DeliveryPizza(String newToppings, double newPrice, String deliveryAddress) {
        super(newToppings, newPrice);
        this.deliveryAddress = deliveryAddress;
        this.determineDeliveryFee = (newPrice > 15) ? 3.0 : 5.0;
    }
    public void displayDelivery() {
        super.displayToppingsAndPrice();
        System.out.println("\n--------------------------------------------------------");
        System.out.print("  Delivery Address: " + deliveryAddress);
        System.out.print("  Delivery Fee: $" + determineDeliveryFee);
        System.out.println("\n");


    }
}
