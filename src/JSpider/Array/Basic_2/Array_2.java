package JSpider.Array.Basic_2;

import java.util.Arrays;

public class Array_2 {
    //    WAJP to print alternate element of the array from end.
    public static void alternateElementFromEnd(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i -= 2) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void swapTwoIndex(int[] arr, int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

    public static int[] insertAtIndex(int[] arr, int element, int ind) {
        int[] newArr = new int[arr.length + 1];
        newArr[ind] = element;
        for (int i = 0; i < arr.length; i++) {
            if (i < ind) {
                newArr[i] = arr[i];
            } else {
                newArr[i + 1] = arr[i];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        alternateElementFromEnd(arr);
        swapTwoIndex(arr, 3, 5);
        System.out.println();
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(insertAtIndex(arr, 350, 3)));
    }
}
