package DataStructures.queue;

import java.util.Queue;
import java.util.LinkedList;

public class BankQueue {
    public static void main(String[] args) {
        Queue<String> customers = new LinkedList<>();

        // Enqueue customers
        customers.add("Ali");
        customers.add("Sara");
        customers.add("Hadi");
        customers.add("Fatemeh");

        System.out.println("Now serving customers:");

        // Dequeue customers
        while (!customers.isEmpty()) {
            System.out.println("Serving: " + customers.poll());
        }
    }
}
