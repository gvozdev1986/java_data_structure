package by.hvozdzeu.structure.queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            queue.add(i);
        }
        System.out.println("Element in the queue : " + queue);

        int removed = queue.remove();
        System.out.println("Removed: " + removed);

        int top = queue.peek();
        System.out.println("Top element is : " + top);

        System.out.println(queue);
    }

}
