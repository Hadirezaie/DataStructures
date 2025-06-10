package DataStructures.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListBenchmarkAdvanced {

    static final int REPEATS = 5; // total number of repetitions for each test
    // This allows us to get a more accurate average time for each operation

    public static void main(String[] args) {

        int[] sizes = { 100_000, 1_000_000 }; // test sizes for the benchmark
        System.out.println("Benchmarking ArrayList vs LinkedList for sizes: " + sizes[0] + " and " + sizes[1]);

        for (int size : sizes) {
            System.out.println("\n====== Benchmark for size = " + size + " ======\n");

            benchmarkList(new ArrayList<>(), "ArrayList", size);
            benchmarkList(new LinkedList<>(), "LinkedList", size);
        }
    }

    private static void benchmarkList(List<Integer> list, String type, int size) {

        System.out.println(">>> Testing " + type);

        long totalAddLast = 0;
        long totalGet = 0;
        long totalAddFirst = 0;

        for (int repeat = 1; repeat <= REPEATS; repeat++) {
            list.clear();

            // --------- Add Last ---------
            long start = System.nanoTime();
            for (int i = 0; i < size; i++) {
                list.add(i);
            }
            long end = System.nanoTime();
            long addLastTime = end - start;
            totalAddLast += addLastTime;

            // --------- Get(index) ---------
            start = System.nanoTime();
            for (int i = 0; i < size; i++) {
                int val = list.get(i);
            }
            end = System.nanoTime();
            long getTime = end - start;
            totalGet += getTime;

            // --------- Add First ---------
            start = System.nanoTime();
            for (int i = 0; i < 1000; i++) {
                list.add(0, i);
            }
            end = System.nanoTime();
            long addFirstTime = end - start;
            totalAddFirst += addFirstTime;
        }

        // --------- Print Average Results ---------
        System.out.printf("Average Add Last: %.2f ms\n", totalAddLast / REPEATS / 1_000_000.0);
        System.out.printf("Average Get(index): %.2f ms\n", totalGet / REPEATS / 1_000_000.0);
        System.out.printf("Average Add First: %.2f ms\n", totalAddFirst / REPEATS / 1_000_000.0);
        System.out.println("-------------------------------------------\n");
    }
}
