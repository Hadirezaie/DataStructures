package DataStructures.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(1);

        // Peek
        System.out.println("Top element: " + stack.peek());

        // Pop
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
        System.out.println("Stack after popping all elements: " + stack);
    }
}
