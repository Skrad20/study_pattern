package Pizzes;

import Factoryes.PizzaIngredientFactory;

public class ClamPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
// Абстрактная фабрика
    public void prepare(){
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDought();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createSheese();
        clam = ingredientFactory.createClams();
    }
}
