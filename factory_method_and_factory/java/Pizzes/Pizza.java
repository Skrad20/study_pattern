package Pizzes;
import java.util.ArrayList;

import Ingredients.Dough;
import Ingredients.Sauce;
import Ingredients.Sheese;
import Ingredients.Pepperoni;
import Ingredients.Veggies;
import Ingredients.Clams;

public abstract class Pizza {
    String name;
    String description;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Sheese cheese;
    Pepperoni pepperoni;
    Clams clam;
        
    public abstract void prepare();

    public void bake(){
        System.out.println("Bake 25 mimutes at 350 ");
    }

    public void cut(){
        System.out.println("Cuttingthe pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Please pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString() {
        // Код вывода описания пиццы
        return this.description;
    }
}
