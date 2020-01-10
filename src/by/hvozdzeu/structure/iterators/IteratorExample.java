package by.hvozdzeu.structure.iterators;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {
        Collection collection = Arrays.asList("red", "orange", "yellow", 20, 1L, 20.202, new Object());
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
