import fly.FlyWithWings;
import quack.MuteQuack;

public class RubberDuck extends Duck {
    public RubberDuck(){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyWithWings();
    };
    
    public void display(){
        System.out.println("I am Rubber duck");
    };
}
