package by.hvozdzeu.structure.challenge;

import java.util.ArrayList;
import java.util.Arrays;

public class GroceryList {

    public static void main(String[] args) {
        ArrayList<String> groceries1 = new ArrayList<>(Arrays.asList("Milk", "Bread", "Cheese"));
        ArrayList<String> groceries2 = new ArrayList<>(Arrays.asList("Sugar", "Flour", "Baking soda"));

        groceries1.add("Bacon");
        groceries1.addAll(groceries2);
        System.out.println(groceries1);

        if (groceries1.contains("Milk")) {
            groceries1.remove("Milk");
        }
        System.out.println(groceries1);
    }

}
