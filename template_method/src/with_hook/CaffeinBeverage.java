package with_hook;

public abstract class CaffeinBeverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()) {
            addCondiments();
        }
    }
    public abstract void brew();
    public abstract void addCondiments();
    public void boilWater() {
        System.out.println("Boiling water");
    }
    public void pourInCup() {
        System.out.println("Pouring in cup");
    }
    // Hook
    public boolean customerWantsCondiments() {
        return true;
    }
}
