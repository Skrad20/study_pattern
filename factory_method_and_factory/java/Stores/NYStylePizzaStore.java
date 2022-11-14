import Pizzes.NYStyleCheesePizza;
import Pizzes.Pizza;

package Stores;
public class NYStylePizzaStore extends PizzaStore {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equals("cheese")){
            pizza = new NYStyleCheesePizza();
        } else {
            pizza = null;
        }
        return pizza;
    }
    
}