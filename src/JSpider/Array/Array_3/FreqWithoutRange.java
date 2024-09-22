package JSpider.Array.Array_3;

import java.util.HashMap;

public class FreqWithoutRange {
    public static void printFreq(int[] arr) {
        HashMap<Integer, Integer> freqMp = new HashMap<>();
        for (int val : arr) {
            if (freqMp.containsKey(val)) {
                freqMp.put(val, freqMp.get(val) + 1);
            } else {
                freqMp.put(val, 1);
            }
        }

        for (int key : freqMp.keySet()) {
            System.out.printf("%3d :  %-3d",key,freqMp.get(key));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -2, 5, 33,-65, 890, 45, -65,5, 87, -38};
        printFreq(arr);
    }
}
