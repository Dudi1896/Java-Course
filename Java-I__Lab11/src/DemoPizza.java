public class DemoPizza {

    public static void main(String[] args) {
        Pizza pizzaObj_1 = new Pizza("pepperoni", 14.99);
        Pizza pizzaObj_2 = new Pizza("green pepper", 12.99);

        DeliveryPizza delPizzaObj_1 = new DeliveryPizza("Cheese", 11.99, "47 Oak Lane");
        DeliveryPizza delPizzaObj_2 = new DeliveryPizza("Pepperoni, sausage, pineapple", 19.50, "22 Acorn Ave");

        System.out.println("\nPizza: ");
        pizzaObj_1.displayToppingsAndPrice();
        pizzaObj_2.displayToppingsAndPrice();
        System.out.println("\n");


        System.out.println("\nPizza Delivery: ");
        delPizzaObj_1.displayDelivery();
        delPizzaObj_2.displayDelivery();
    }
}