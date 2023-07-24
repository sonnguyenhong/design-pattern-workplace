package duck_simulator;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Cannot Quack");
    }
}
