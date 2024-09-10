package JSpider.Array.Day6.IMP_Concept;

import java.util.Arrays;

//For the given array which contains elements from 0 up to 100 . Print the frequency of each element.
public class Q1_ArrayImp {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 1, 23, 32, 32, 88, 65, 44, 33, 23, 46, 6, 78, 67};
        System.out.println("Array : ");
        System.out.println(Arrays.toString(arr));

        int[] freqArr = calculateFreq(arr);
        System.out.println("Freq Array : ");
        System.out.println(Arrays.toString(freqArr));

        System.out.println("Print Freq : ");
        for (int i = 0; i < freqArr.length; i++) {
            if (freqArr[i] != 0) {
                System.out.printf("%3d %3d\n", i, freqArr[i]);
            }
        }

    }

    public static int[] calculateFreq(int[] arr) {
        int[] freqArr = new int[101];
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
//            freqArr[num - 1]++; is not working here it is not incrementing any value
            freqArr[num] = freqArr[num] + 1;
        }
        return freqArr;
    }

}
