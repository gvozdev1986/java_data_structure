package by.hvozdzeu.structure.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionExample {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 1, 2, 3, 4, 5, 6, 7, 8, 0);
        System.out.println("Position of 3 : " + Collections.binarySearch(list1, 4));
    }
}
