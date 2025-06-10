package DataStructures.stack;

import java.util.Stack;

public class ReverseString {
    public static String reverse(String input) {
        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Pop all characters to form reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String str = "Hadi";
        String reversedStr = reverse(str);
        System.out.println("Reversed: " + reversedStr);
    }
}
