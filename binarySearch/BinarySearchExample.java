package DataStructures.binarySearch;

public class BinarySearchExample {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2; // to prevent overflow
            if (arr[mid] == target) {
                return mid; // found the target
            } else if (arr[mid] < target) {
                left = mid + 1; // in the right half
            } else {
                right = mid - 1; // in the left half
            }
        }

        return -1; // target not found
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 11, 13 };
        int target = 13; // Element to search for
        // Ensure the array is sorted before performing binary search

        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
