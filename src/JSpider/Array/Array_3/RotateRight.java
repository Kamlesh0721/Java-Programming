package JSpider.Array.Array_3;

import java.util.Arrays;

public class RotateRight {
    public static void rotateByOne(int[] arr) {

        // if Empty array is given otherwise temp will give exception
        if (arr.length <= 0) {
            System.out.println("Empty Array ...");
            return;
        }

        int temp = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = temp;
    }


    // Brute force approach : Time Complexity : O(n^2) | Space Complexity : O(1)
    public static void rotateByKposition_approach1(int[] arr, int k) {
        if(arr.length<=0){
            System.out.println("Empty Array ...");
            return;
        }
        if (k > arr.length) {
            k = k % arr.length;
        }
        while (k > 0) {
            rotateByOne(arr);
            k--;
        }
    }

    // Brute force approach : Time Complexity : O(n) | Space Complexity : O(m)
    public static void rotateByKposition_approach2(int[] arr, int k) {

        if(arr.length<=0){
            System.out.println("Empty ...");
            return;
        }
        if (k > arr.length) {
            k = k % arr.length;
        }
        // store last k element in separate array
        int[] tempArr = new int[k];
        for (int i = arr.length - k, j = 0; i < arr.length; i++, j++) {
            tempArr[j] = arr[i];
        }

        for (int i = arr.length - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }
        for (int i = 0; i < k; i++) {
            arr[i] = tempArr[i];
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("Before : " + Arrays.toString(arr));
        rotateByOne(arr);
        System.out.println("After : " + Arrays.toString(arr));


        System.out.println("Before : " + Arrays.toString(arr));
        rotateByKposition_approach1(arr, 10);
        System.out.println("After : " + Arrays.toString(arr));


        System.out.println("Before : " + Arrays.toString(arr));
        rotateByKposition_approach2(arr, 10);
        System.out.println("After : " + Arrays.toString(arr));

    }
}
