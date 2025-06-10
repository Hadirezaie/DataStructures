package DataStructures.stack;

import java.util.Stack;

public class BalancedParentheses {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String exp1 = "(())()";
        String exp2 = "(()))";

        System.out.println(exp1 + " is balanced? " + isBalanced(exp1));
        System.out.println(exp2 + " is balanced? " + isBalanced(exp2));
    }
}
