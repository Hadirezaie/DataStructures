package DataStructures.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Enqueue
        pq.add(30);
        pq.add(10);
        pq.add(50);
        pq.add(20);

        // Dequeue - smallest element first (default behavior)
        while (!pq.isEmpty()) {
            System.out.println("Dequeued: " + pq.poll());
        }
    }
}
