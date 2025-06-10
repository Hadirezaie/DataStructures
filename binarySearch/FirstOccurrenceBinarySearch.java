package DataStructures.binarySearch;

public class FirstOccurrenceBinarySearch {
    public static int firstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("mid: " + mid);
            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; // go to the left side to find the first occurrence
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 3, 3, 4, 5 };
        int target = 3;

        int result = firstOccurrence(arr, target);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("First occurrence at index: " + result);
        }
    }
}
