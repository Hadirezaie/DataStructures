package DataStructures.binarySearch;

public class LastOccurrenceBinarySearch {

    public static int lastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                result = mid;
                low = mid + 1; // continue searching in the right half
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 3, 4, 5 };
        int target = 2;

        int result = lastOccurrence(arr, target);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Last occurrence at index: " + result);
        }
    }
}