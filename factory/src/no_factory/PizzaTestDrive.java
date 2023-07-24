package no_factory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        DependentPizzaStore pizzaStore = new DependentPizzaStore();
        Pizza pizza = pizzaStore.createPizze("NY", "cheese");
    }
}
