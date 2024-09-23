package JSpider.Array.Array_3;

import java.util.Arrays;

public class SecondLargestAndSmallest {
    public static int secondLargest1(int[] a) {
        // sort reverse order
        Arrays.sort(a);
        int largest = a[a.length - 1];
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] < largest) {
                return a[i];
            }
        }
        return largest;// return largest if there is no second largest
    }

    public static int secondLargest2(int[] a) {
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                secLargest = largest;
                largest = a[i];
            }
        }
        if (secLargest == Integer.MIN_VALUE) {
            return largest;
        }
        return secLargest;
    }

    public static int secondSmallest1(int[] arr) {

        Arrays.sort(arr);
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > smallest) {
                return arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(secondLargest1(arr));
        System.out.println(secondLargest2(arr));
        System.out.println(secondSmallest1(arr));
    }
}
