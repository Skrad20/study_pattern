package Factoryes;


import Ingredients.Dough;
import Ingredients.Olion;
import Ingredients.Sauce;
import Ingredients.Sheese;
import Ingredients.Pepperoni;
import Ingredients.Veggies;
import Ingredients.Clams;


public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDought(){
        return new Dough();
    }
    public Sauce createSauce(){
        return new Sauce();
    }
    public Sheese createSheese(){
        return new Sheese();
    }
    public Veggies[] createVeggies(){
        Veggies[] veggies = {new Veggies(), new Olion()};
        return veggies;
    }
    public Pepperoni createPepperoni(){
        return new Pepperoni();
    }
    public Clams createClams(){
        return new Clams();
    }
}
