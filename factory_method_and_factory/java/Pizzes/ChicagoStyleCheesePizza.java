package Pizzes;
public class ChicagoStyleCheesePizza  extends Pizza{
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Sauce and Cheese Pizza";
        //dough = "Extra Thick Crust Dough";
        //sauce = "Plum Tomato Sauce";       
        //toppings.add("Shredded Mozzarella Cheese");
    }
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
    public void prepare() {
        System.out.println("Cutting the pizza into square slices");
    }
}
