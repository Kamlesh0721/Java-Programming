package JSpider.Array.Array_3;

import java.util.Arrays;

public class FrequencyInRange {
    // range 0to100
    public static void printFreq(int[] arr) {
        int[] freqArr = new int[101];
        for(int num:arr){
            freqArr[num]=freqArr[num]+1;
        }

        for(int i=0;i<freqArr.length;i++){
            if (freqArr[i]>0){
                System.out.print(i+" "+freqArr[i]);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 1, 3, 3, 4, 5, 32, 4, 34, 4, 1, 4, 5, 4, 23, 45, 6, 23, 3};
        printFreq(arr);
    }
}
