package Stores;

import java.util.HashMap;
import java.util.Map;

import Factoryes.ChicagoPizzaIngredientFactory;
import Factoryes.PizzaIngredientFactory;
import Pizzes.CheesePizza;
import Pizzes.Pizza;


public class ChicagoStylePizzaStore extends PizzaStore {
    
    Map <String, Pizza> pizzesType = new HashMap<String, Pizza>();

    public Pizza createPizza(String type){
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        pizzesType.put("cheese", new CheesePizza(ingredientFactory));

        Pizza pizza =  pizzesType.get(type);
        pizza.setName("Cheese");
        return pizza;
    }
}
