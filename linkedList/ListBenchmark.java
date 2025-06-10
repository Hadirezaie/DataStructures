package DataStructures.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListBenchmark {
    public static void main(String[] args) {

        int size = 100_000; // Test size for the benchmark
        System.out.println("Benchmarking ArrayList vs LinkedList with size: " + size);

        // ************* ArrayList *************
        List<Integer> arrayList = new ArrayList<>();

        long start = System.nanoTime();
        // add items to the end
        // This is O(1) amortized time complexity for ArrayList
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }
        long end = System.nanoTime();
        System.out.println("ArrayList - Add Last: " + (end - start) / 1_000_000 + " ms");

        start = System.nanoTime();
        // all elements access
        // This is O(1) time complexity for ArrayList
        for (int i = 0; i < size; i++) {
            int val = arrayList.get(i);
        }
        end = System.nanoTime();
        System.out.println("ArrayList - Get(index): " + (end - start) / 1_000_000 + " ms");

        start = System.nanoTime();
        // add items to the beginning
        // This is O(n) time complexity for ArrayList because it needs to shift elements
        for (int i = 0; i < 1000; i++) {
            arrayList.add(0, i);
        }
        end = System.nanoTime();
        System.out.println("ArrayList - Add First: " + (end - start) / 1_000_000 + " ms");

        // ************* LinkedList *************
        List<Integer> linkedList = new LinkedList<>();

        start = System.nanoTime();
        // add items to the end
        // This is O(1) time complexity for LinkedList
        for (int i = 0; i < size; i++) {
            linkedList.add(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList - Add Last: " + (end - start) / 1_000_000 + " ms");

        start = System.nanoTime();
        // all elements access
        // This is O(n) time complexity for LinkedList because it needs to traverse the
        // list
        for (int i = 0; i < size; i++) {
            int val = linkedList.get(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList - Get(index): " + (end - start) / 1_000_000 + " ms");

        start = System.nanoTime();
        // add items to the beginning
        // This is O(1) time complexity for LinkedList because it can directly add to
        for (int i = 0; i < 1000; i++) {
            linkedList.add(0, i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList - Add First: " + (end - start) / 1_000_000 + " ms");
    }
}
