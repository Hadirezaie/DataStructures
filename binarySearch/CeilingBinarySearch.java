package DataStructures.binarySearch;

public class CeilingBinarySearch {
    public static int ceiling(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                result = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6 };
        int target = 3;
        int ceilingValue = ceiling(arr, target);
        if (ceilingValue != -1) {
            System.out.println("Ceiling of " + target + " is: " + ceilingValue);
        } else {
            System.out.println("No ceiling found for " + target);
        }
    }
}
