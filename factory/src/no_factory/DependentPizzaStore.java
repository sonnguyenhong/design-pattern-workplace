package no_factory;

public class DependentPizzaStore {
    public Pizza createPizze(String style, String type) {
        Pizza pizza = null;
        if(style.equals("NY")) {
            if(type.equals("cheese")) {
                pizza = new NYCheesePizza();
            }
        } else if(style.equals("Chicago")) {
            if(type.equals("cheese")) {
                pizza = new ChicagoCheesePizza();
            }
        } else {
            System.out.println("Error: invalid type of pizza");
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
