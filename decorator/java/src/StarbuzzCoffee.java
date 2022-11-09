package decorator.java.src;

import decorator.java.src.decorators.Mocha;
import decorator.java.src.decorators.Soy;
import decorator.java.src.decorators.Whip;
import decorator.java.src.Beverage;
import decorator.java.src.Esspresso;
import decorator.java.src.HouseBlend;

public class StarbuzzCoffee {
    public static void main(String args[]){
        Beverage beverage = new Esspresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(
            beverage2.getDescription() + " $" + beverage2.cost()
        );
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Whip(beverage3);
        beverage3 = new Whip(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(
            beverage3.getDescription() + " $" + beverage3.cost()
        );
    }
}
