package Factoryes;

import Ingredients.Dough;
import Ingredients.Sauce;
import Ingredients.Sheese;
import Ingredients.Pepperoni;
import Ingredients.Veggies;
import Ingredients.Clams;

// Абстрактная фабрика
public interface PizzaIngredientFactory {
    public Dough createDought();
    public Sauce createSauce();
    public Sheese createSheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();

    
}
