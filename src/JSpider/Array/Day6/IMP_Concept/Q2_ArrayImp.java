package JSpider.Array.Day6.IMP_Concept;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// For the given array which contains elements in any range print the frequency of each elements.
public class Q2_ArrayImp {
    public static void main(String[] args) {
        int[] arr = {22, 32, 13, 44, 23, 22, 66, 54, 34, 22, 55, 88, 47, 88, 55, 54, 43, 76};
        System.out.println(Arrays.toString(arr));
        getFreq(arr);
    }

    public static void getFreq(int[] arr) {
        HashMap<Integer, Integer> freq_calc = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (freq_calc.containsKey(arr[i])) {
                freq_calc.put(arr[i], freq_calc.get(arr[i]) + 1);
            } else {
                freq_calc.put(arr[i], 1);
            }
        }

        for (Map.Entry entry:freq_calc.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
