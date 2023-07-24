package duck_sorter;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DuckSorter {
    public static void main(String[] args) {
        Duck[] ducks = {
            new Duck("Daffy", 8),
            new Duck("Dewey", 2),
            new Duck("Howard", 7),
            new Duck("Louie", 2),
            new Duck("Donald", 10),
            new Duck("Huey", 2)
        };
        System.out.println("Before sort: ");
        display(ducks);

        Arrays.sort(ducks);
        System.out.println("After sort: ");
        display(ducks);
    }

    private static void display(Duck[] ducks) {
        for(int i = 0 ; i < ducks.length ; i++) {
            System.out.println(ducks[i]);
        }
    }
}
