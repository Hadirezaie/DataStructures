package DataStructures.queue;

import java.util.Queue;
import java.util.LinkedList;

public class SimpleQueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue (add elements)
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Peek (front element)
        System.out.println("Front element: " + queue.peek());

        // Dequeue (remove elements)
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.poll());
        }
    }
}
