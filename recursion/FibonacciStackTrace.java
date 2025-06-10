package DataStructures.recursion;

public class FibonacciStackTrace {
    static int depth = 0; // shows the current depth of recursion

    public static int fibonacci(int n) {
        printIndent();
        System.out.println("Entering: fibonacci(" + n + ")");
        depth++; // entering the stack

        int result;
        if (n == 0) {
            result = 0;
        } else if (n == 1) {
            result = 1;
        } else {
            result = fibonacci(n - 1) + fibonacci(n - 2);
        }

        depth--; // exiting the stack
        printIndent();
        System.out.println("Returning: fibonacci(" + n + ") = " + result);
        return result;
    }

    public static void printIndent() {
        for (int i = 0; i < depth; i++) {
            System.out.print("  "); // Indentation for visualizing the depth of recursion
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int result = fibonacci(n);
        System.out.println("\nFinal result: fibonacci(" + n + ") = " + result);
    }
}
