package DataStructures.binarySearch;

public class FloorBinarySearch {
    public static int floor(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= target) {
                result = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6 };
        int target = 3;
        int floorValue = floor(arr, target);
        if (floorValue != -1) {
            System.out.println("Floor of " + target + " is: " + floorValue);
        } else {
            System.out.println("No floor found for " + target);
        }
    }
}
