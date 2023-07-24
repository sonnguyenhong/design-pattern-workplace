package with_hook;

import without_hook.CaffeinBeverage;

public class Tea extends CaffeinBeverage {
    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }
}
