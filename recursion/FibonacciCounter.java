package DataStructures.recursion;

public class FibonacciCounter {
    static int counter = 0; // recursion calls counter

    public static int fibonacci(int n) {
        counter++; // Increment the counter for each function call
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 7;
        int result = fibonacci(n);
        System.out.println("fib(" + n + ") = " + result);
        System.out.println("Total function calls: " + counter);
    }
    // time complexity: O(2^n) = 2^7 = 128 , but here shows 41
    // space complexity: O(n)
}
