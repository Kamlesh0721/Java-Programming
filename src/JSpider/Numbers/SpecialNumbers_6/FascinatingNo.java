package JSpider.Numbers.SpecialNumbers_6;

import java.util.HashSet;

public class FascinatingNo {
    public static boolean isFascinating(int n) {
        int twice = 2 * n;
        int thrice = 3 * n;
        String s_num = "" + n + twice + thrice;
        long num = Long.parseLong(s_num);
        HashSet<Integer> check = new HashSet<>();
        while (num > 0) {
            int lastDigit = (int) (num % 10);
            if (lastDigit != 0) {
                if (check.contains(lastDigit)) {
                    return false;
                } else {
                    check.add(lastDigit);
                }
            }
            num /= 10;
        }

        return check.size() == 9;
    }

    public static int fascinatingCountFirst1000() {
        int count = 0;
        for (int num = 1; num <= 1000; num++) {
            if (isFascinating(num)) {
                System.out.print(num + " ");
                count++;
            }
        }
        System.out.println();
        return count;
    }


    public static void main(String[] args) {
        System.out.println(isFascinating(192));
        System.out.println(isFascinating(100));

        System.out.println("Count : " + fascinatingCountFirst1000());
    }


}
