package JSpider.Array.Sorting;

import java.util.Arrays;

// * Bubble Sort - Push max element at back by adjacent swapping.
// Time Complexity :
// Worst : O (n^2)
// Average : O(n^2)
// Best : O(n^2)

//In bubble sort algorithm we check two corresponding element of array and if the element at ith position
// is greater than element at i+t th position Then we have to swap the two elements .
// This procedure has to repeated until all the elements are sorted.
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 0, -1};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // This will always run O(n^2) time even if we give sorted array.
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                }
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int f) {
        int temp = arr[i];
        arr[i] = arr[f];
        arr[f] = temp;
    }
}
