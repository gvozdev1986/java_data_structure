package by.hvozdzeu.structure.lists;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList states = new LinkedList();
        states.add("Alaska");
        states.add("Arizona");
        states.add("Colorado");
        states.add("Pennsylvania");
        states.addFirst("Alabama");
        states.addLast("Washington");

        System.out.println(states);
        System.out.println("First state in my list : " + states.getFirst());
        System.out.println("Last state in my list : " + states.getLast());

        ListIterator iterator = states.listIterator(states.size());
        while (iterator.hasPrevious()) {
            System.out.println("Previous state : " + iterator.previous());
        }

    }

}
