public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        
        Pizza pizza;
        pizza = createPizza(type);
        System.out.println(1);
        pizza.prepare();
        System.out.println(2);
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    
    abstract Pizza createPizza(String type);
}
