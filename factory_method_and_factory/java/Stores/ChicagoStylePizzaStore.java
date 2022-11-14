import Pizzes.ChicagoStyleCheesePizza;
import Pizzes.Pizza;

package Stores;
public class ChicagoStylePizzaStore extends PizzaStore {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equals("cheese")){
            pizza = new ChicagoStyleCheesePizza();
        }
        return pizza;
    }
}
