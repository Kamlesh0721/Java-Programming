package JSpider.Array.Day6;

import java.util.Arrays;
import java.util.Scanner;

//WAP to remove the element from given index
public class Q2_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12, 20, 23, 32, 43, 45, 23, 56, 84, 32};

        System.out.println("Array Before insertion : ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter index : ");
        int index = sc.nextInt();

        int[] newArr = removeFromIndex(arr, index);
        System.out.println("After Deletion :");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }

    private static int[] removeFromIndex(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else {
                newArr[i] = arr[i + 1];
            }
        }
        return newArr;
    }
}
