import fly.FlyWithWings;
import quack.Quack;

public class DecoyDuck extends Duck {
    public DecoyDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    };
    
    public void display(){
        System.out.println("I am Decoy duck");
    };
}
