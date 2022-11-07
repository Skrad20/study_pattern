import fly.FlyBehavior;
import quack.QuackBehavior;

public abstract class Duck {
    
    
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public static void main(String[] args) {
        
    }

    public abstract void display();

    void preformQuack() {
        quackBehavior.quack();
    }
    void preformFly() {
        flyBehavior.fly();
    }
    void swim() {
        System.out.println("Swim duck");
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
    
}
