package DataStructures.recursion;

public class FactorialExample {
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base Case
        } else {
            return n * factorial(n - 1); // Recursive Call
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
