package JSpider.Array.Day6;
// WAP to insert a element at certain position in array

import java.util.Arrays;
import java.util.Scanner;

public class Q1_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12, 20, 23, 32, 43, 45, 23, 56, 84, 32};

        System.out.println("Array Before insertion : ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter index : ");
        int index = sc.nextInt();
        System.out.println("Enter Element to insert : ");
        int element = sc.nextInt();

        int[] newArr = insertAtIndex(arr, index, element);
        System.out.println("After insertion :");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }

    public static int[] insertAtIndex(int[] arr, int index, int element) {
        int[] newArr = new int[arr.length + 1];
        newArr[index] = element;
        for (int i = 0; i < arr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else {
                newArr[i + 1] = arr[i];
            }
        }
        return newArr;
    }
}
