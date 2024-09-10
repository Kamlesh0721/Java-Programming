package JSpider.Array.Sorting;

import java.util.Arrays;

public class mergeSortAlgo {
    public static void main(String[] args) {
        int[] arr = {30, 12, 40, 10, 16, 28};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr);

    }

    public static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    public static void mergeSort(int[] arr, int startIn, int endIn) {
        if (startIn < endIn) {
            int mid = startIn + ((endIn - startIn) / 2);
            mergeSort(arr, startIn, mid);
            mergeSort(arr, mid + 1, endIn);
            merge(arr, startIn, mid, endIn);
        }
    }

    public static void merge(int[] arr, int startIn, int mid, int endIn) {

    }
}
