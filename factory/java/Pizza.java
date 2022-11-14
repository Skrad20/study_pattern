import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();
    
    void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough " + dough);
        System.out.println("Adding sauce " + sauce);
        System.out.println("Adding toppings");
        for (String topping : toppings){
            System.out.println(" " + topping);
        }
    }

    void bake(){
        System.out.println("Bake 25 mimutes at 350 ");
    }

    void cut(){
        System.out.println("Cuttingthe pizza into diagonal slices");
    }

    void box(){
        System.out.println("Please pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }
}
