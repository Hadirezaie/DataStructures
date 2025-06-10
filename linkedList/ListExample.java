package DataStructures.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Add elements
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        // Access elements
        System.out.println("ArrayList element at index 1: " + arrayList.get(1)); // O(1)
        System.out.println("LinkedList element at index 1: " + linkedList.get(1)); // O(n)

        // Add to beginning
        arrayList.add(0, 0); // O(n)
        linkedList.add(0, 0); // O(1)

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
    }
}
