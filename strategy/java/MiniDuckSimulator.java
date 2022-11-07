import fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.preformFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.preformQuack();
        model.preformFly();
    }
}
