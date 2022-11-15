package Pizzes;
public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        //dough = "Thin Crust Dough";        
        //sauce = "Marinara Sauce";         
        //toppings.add("Grated Reggiano Cheese");
    }
    
    public void prepare() {
        System.out.println("Cutting the pizza into square slices");
    }
}
