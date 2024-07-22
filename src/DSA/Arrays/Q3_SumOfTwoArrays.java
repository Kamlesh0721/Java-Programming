package DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
      3 1 0 7 5
  + 1 1 1 1 1 1
    1 4 2 1 8 6
*/
public class Q3_SumOfTwoArrays {
    public static int[] createArr() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[] arraySum(int[] arr1, int[] arr2) {
        int len1 = arr1.length - 1;
        int len2 = arr2.length - 1;

        // find which array is larger
        int max = Math.max(len1, len2) + 2;
        // create array that store sum of number
        int[] sum = new int[max];

        // reducing length because index start from 0 and we are going to use max integer to access sumarray index
        max--;

        int carry = 0;
        while (max >= 0) {
            int digitSum = carry;
            if (len1 >= 0) {
                digitSum += arr1[len1];
            }
            if (len2 >= 0) {
                digitSum += arr2[len2];
            }
            int digit = digitSum;
            if (digitSum >= 10) {
                digit = digitSum % 10;
                carry = digitSum / 10;
            }
            sum[max] = digit;

            len1--;
            len2--;
            max--;
        }
        return sum;
    }

    public static void main(String[] args) {
//        int[] arr1 = createArr();
//        int[] arr2 = createArr();

//        int arraySum = arraySum(arr1, arr2);
//        int arraySum = arraySum(new int[]{1, 2, 3, 4}, new int[]{9, 9, 9, 9});
        int[] arraySum = arraySum(new int[]{9, 9, 9, 9}, new int[]{9, 9, 9, 9, 9});
        System.out.println(Arrays.toString(arraySum));

    }
}
