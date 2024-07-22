package DSA.Arrays;

import java.util.Arrays;

public class Q4_DiffOfTwoArrays {
    static int[] getDiff(int[] arr1, int[] arr2) {
        int len1 = arr1.length - 1;
        int len2 = arr2.length - 1;
        int len3 = (len1 > len2) ? len1 : len2;
        int[] diff = new int[len3 + 1];

        while (len3 >= 0) {
             
            len3--;
        }
        return diff;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(getDiff(new int[]{1, 2, 5}, new int[]{1, 1, 1, 1})));
    }
}
