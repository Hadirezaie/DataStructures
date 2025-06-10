package DataStructures.recursion;

public class FibonacciExample {
    // fibonacci formula:
    // fib(n) = fib(n-1) + fib(n-2); n ≥ 2
    // fib(0) = 0
    // fib(1) = 1

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Base Case
        } else if (n == 1) {
            return 1; // Base Case
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Recursive Calls
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }

    // time complexity: O(2^n)
    // space complexity: O(n)
    // This implementation is not efficient for large n due to exponential time
    // complexity.
}
