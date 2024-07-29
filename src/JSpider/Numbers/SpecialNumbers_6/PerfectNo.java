package JSpider.Numbers.SpecialNumbers_6;

// https://leetcode.com/problems/perfect-number/description/
public class PerfectNo {

    public static boolean isPerfectNo(int n) {
        int sum = 0;
        for (int fact = 1; fact <= n; fact++) {
            if (n % fact == 0) {
                sum += fact;
            }
        }
        return sum == n * 2;
    }

    public static int perfectNoUpto100() {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (isPerfectNo(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        return count;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNo(6));

        // Perfect No. upto 100
        System.out.println("Count : " + perfectNoUpto100());
    }
}
