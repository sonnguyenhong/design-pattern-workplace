package duck_simulator;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.performQuack();
        duck.performFly();

        duck = new RubberDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.setFlyBehavior(new FlyWithWings());
        duck.performFly();
    }
}
