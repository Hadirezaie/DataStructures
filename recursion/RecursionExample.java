package DataStructures.recursion;

public class RecursionExample {
    public static void printNumbers(int n) {
        if (n == 0) {
            return; // Base Case
        }
        printNumbers(n - 1); // Recursive Call
        System.out.println(n); // Process after recursive call
    }

    public static void main(String[] args) {
        printNumbers(5);
    }
}
