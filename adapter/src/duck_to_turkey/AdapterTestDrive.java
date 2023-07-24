package duck_to_turkey;

public class AdapterTestDrive {
    public static void main(String[] args) {
        System.out.println("Mallard Duck: ");
        Duck duck = new MallardDuck();
        performAsDuck(duck);

        System.out.println("Wild Turkey: ");
        Turkey wildTurkey = new WildTurkey();
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("Adapter Turkey to Duck: ");
        Duck turkeyToDuck = new TurkeyAdapter(wildTurkey);
        performAsDuck(turkeyToDuck);
    }
    private static void performAsDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
