import fly.FlyNoWay;
import quack.Quack;

public class RedheadDuck extends Duck {
    public RedheadDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    };
    
    public void display(){
        System.out.println("I am Redhead duck");
    };
}
