package JSpider.Array.Sorting;

import java.util.Arrays;

// Time complexity : O (n^2) - Worst,Average,Best all are O (n^2)
public class SelectionSort {
    public static void swap(int[] arr, int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minInd = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minInd] > arr[j]) {
                    minInd = j;
                }
            }
            swap(arr, i, minInd);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
