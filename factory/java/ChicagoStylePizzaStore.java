public class ChicagoStylePizzaStore extends PizzaStore {
    public Pizza createPizza(String type){
        System.out.println(3);
        Pizza pizza = null;
        if (type.equals("sheese")){
            pizza = new ChicagoStyleCheesePizza();
        }
        return pizza;
    }
}
