package DataStructures.queue;

import java.util.Deque;
import java.util.ArrayDeque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Add elements from both sides
        deque.addFirst("A"); // Front
        deque.addLast("B"); // Rear
        deque.addFirst("C"); // Front
        deque.addLast("D"); // Rear

        System.out.println("Deque elements: " + deque);

        // Remove elements from both sides
        System.out.println("Removed from front: " + deque.pollFirst());
        System.out.println("Removed from rear: " + deque.pollLast());

        System.out.println("Deque elements now: " + deque);
    }
}
