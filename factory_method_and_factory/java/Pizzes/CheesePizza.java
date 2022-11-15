package Pizzes;

import Factoryes.PizzaIngredientFactory;

public class CheesePizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare(){
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDought();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createSheese();
    }
    
}
