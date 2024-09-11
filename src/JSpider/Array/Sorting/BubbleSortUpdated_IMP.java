package JSpider.Array.Sorting;

import java.util.Arrays;
// Time Complexity :
// Worst : O (n^2)
// Average : O(n^2)
// Best : O(n) // If array is already sorted it will not iterate further.
public class BubbleSortUpdated_IMP {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 3};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] bubbleSort(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int x = 0;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                    x++;
                }
            }
            count++;
            if (x == 0) {
                break;
            }

        }
        System.out.println("Total Iteration : " + count);
        return arr;
    }

    public static void swap(int[] arr, int i, int f) {
        int temp = arr[i];
        arr[i] = arr[f];
        arr[f] = temp;
    }
}
