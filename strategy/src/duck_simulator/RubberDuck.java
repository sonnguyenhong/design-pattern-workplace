package duck_simulator;

public class RubberDuck extends Duck {
    public RubberDuck() {
        this.setFlyBehavior(new FlyNoWay());
        this.setQuackBehavior(new Squeak());
    }
    @Override
    public void display() {
        System.out.println("I am a Rubber Duck");
    }
}
