package JSpider.Array.Array_3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MaxFreq {
    public static int maxOccurance(int[] arr) {
        // freq hashMap
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int element : arr) {
            if (hm.containsKey(element)) {
                hm.put(element, hm.get(element) + 1);
            } else {
                hm.put(element, 1);
            }
        }
        Iterator<Entry<Integer, Integer>> it = hm.entrySet().iterator();
        int max=Integer.MIN_VALUE;
        int res=Integer.MIN_VALUE;
        while (it.hasNext()) {
            Entry<Integer, Integer> currEntry = it.next();
           if(currEntry.getValue()>max){
               max=currEntry.getValue();
               res=currEntry.getKey();
           }
        }
        System.out.println(hm);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 2, 2, 2, -2, 1, 5, 1, 1, 1, 1, 1, 5, 45, 3, 33, -65, 5, 80, 45, -65, 5, 87, -38};
        System.out.println(maxOccurance(arr));
    }
}
