import fly.FlyWithWings;
import quack.Quack;

public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    };
    
    public void display(){
        System.out.println("I am Mallard duck");
    };
}
