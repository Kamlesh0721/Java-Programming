package JSpider.Numbers.SpecialNumbers_6;

import java.util.HashSet;

public class HappyNo {
    public static boolean isHappy(int n) {
        HashSet<Integer> checked = new HashSet<>();
        checked.add(n);
        while (true) {
            int sum = 0;
            while (n > 0) {
                int rem = n % 10;
                sum += rem * rem;
                n /= 10;
            }
            if (sum == 1) {
                return true;
            }
            n = sum;
            if (checked.contains(n)) {
                return false;
            }
            checked.add(n);
        }
    }

    static int HappyNo100() {
        int count = 0;
        for (int num = 1; num <= 100; num++) {
            if (isHappy(num)) {
                System.out.print(num + " ");
                count++;
            }
        }
        System.out.println();
        return count;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(HappyNo100());
    }
}
