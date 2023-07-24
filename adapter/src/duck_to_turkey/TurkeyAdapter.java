package duck_to_turkey;

public class TurkeyAdapter implements Duck {
    private Turkey turkey;
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }
    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }

    public Turkey getTurkey() {
        return turkey;
    }

    public void setTurkey(Turkey turkey) {
        this.turkey = turkey;
    }
}
