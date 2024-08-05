package JSpider.Numbers.Maths_8;

public class Combination {
    public static int comb(int n, int r) {
        if (r > n) {
            return 0; // invalid test case
        }
        int small = (n - r) < r ? (n - r) : r;
        double ans = 1;
        while (small > 0) {
            ans = ans * n / small;
            small--;
            n--;
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        System.out.println(comb(5, 3));
        System.out.println(comb(0, 0));
        System.out.println(comb(1, 0));
        System.out.println(comb(1, 1));
        System.out.println(comb(10, 0));
        System.out.println(comb(10, 10));
        System.out.println(comb(30, 15));
        // invalid
        System.out.println(comb(5, 6));


    }
}
