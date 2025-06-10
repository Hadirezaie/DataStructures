package DataStructures.sorting;

public class InsertionSortExample {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            System.out.println("i = " + i);
            int key = arr[i];
            int j = i - 1;

            // swap elements to find the correct position for key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 5, 1, 4, 3 };
        insertionSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
// Output: 1 3 4 5 9