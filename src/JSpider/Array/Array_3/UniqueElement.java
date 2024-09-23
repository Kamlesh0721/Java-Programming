package JSpider.Array.Array_3;

import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;


public class UniqueElement {
    public static void unique1(int[] a) {
        Arrays.sort(a);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a[0]);
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                list.add(a[i]);
            }
        }
        System.out.println(list);
    }

    public static void unique2(int[] a) {
        Arrays.sort(a);
        int r = 1;
        int l = 0;
        int n = a.length;
        for (; r < n ; r++) {
            if (a[l] != a[r]) {
                a[++l] = a[r];
            }
        }
        //print
        for (int i = 0; i <= l; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
    }

    public static void unique3(int[] a){
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for(int num:a){
            set.add(num);
        }
        System.out.println(set);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 3, 4, 4, 4, 2, 2, 6};
        unique1(a);
        unique2(a);
        unique3(a);
    }
}
