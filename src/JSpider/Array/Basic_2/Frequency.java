package JSpider.Array.Basic_2;

import java.util.Arrays;

// get unique , duplicate and max occured element in given range of 0 to 100.
public class Frequency {

    public static void main(String[] args) {
        int[] arr = {11, 23, 66, 75, 33, 7, 7, 85, 45, 99, 75, 0, 75, 56, 90, 34, 6, 75, 74};
        uniqueElement(arr);
        System.out.println();
        duplicateElement(arr);
        System.out.println();
        System.out.println(maxOccuredElement(arr));
    }

    private static void uniqueElement(int[] arr) {
        int[] freqArr = new int[101];// 0 to 100 -> 101 element
        for (int i = 0; i < arr.length; i++) {
            freqArr[arr[i]]++;
        }

        for (int i = 0; i < freqArr.length; i++) {
            if (freqArr[i] == 1) {
                System.out.print(i + " ");
            }
        }
    }

    public static void duplicateElement(int[] arr) {
        int[] freqArr = new int[101];// 0 to 100 -> 101 element
        for (int i = 0; i < arr.length; i++) {
            freqArr[arr[i]]++;
        }

        for (int i = 0; i < freqArr.length; i++) {
            if (freqArr[i] > 1) {
                System.out.print(i + " ");
            }
        }
    }

    public static int maxOccuredElement(int[] arr) {
        int[] freqArr = new int[101];// 0 to 100 -> 101 element
        for (int i = 0; i < arr.length; i++) {
            freqArr[arr[i]]++;
        }

        int maxOccurance = 0;
        for (int i = 0; i < freqArr.length; i++) {
            if (freqArr[i] > freqArr[maxOccurance]) {
                maxOccurance = i;
            }
        }
        return maxOccurance;
    }
}
