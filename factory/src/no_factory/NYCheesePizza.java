package no_factory;

public class NYCheesePizza extends Pizza {
    public NYCheesePizza() {
        this.setName("NY Style Sauce and Cheese Pizza");
        this.setDough("Thin Crust Dough");
        this.setSauce("Marinara Sauce");

        toppings.add("Grated Reggiano Cheese");
    }
}
