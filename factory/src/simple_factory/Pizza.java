package simple_factory;

public abstract class Pizza {
    private String name;
    public void prepare() {
        System.out.println("Preparing a pizza");
    }
    public void bake() {
        System.out.println("Bake pizza");
    }
    public void cut() {
        System.out.println("Cut pizza");
    }
    public void box() {
        System.out.println("Box pizza");
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }
}
