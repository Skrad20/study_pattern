public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore ntStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();
        
        Pizza pizza = ntStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());

        
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName());
    }
}
