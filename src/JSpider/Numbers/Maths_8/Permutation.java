package JSpider.Numbers.Maths_8;

public class Permutation {
    public static int perm(int n, int r) {
        if (r > n) {
            return 0;
        }
        int ans = 1;

        while (r > 0) {
            ans *= n;
            n--;
            r--;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(perm(5, 3));
        System.out.println(perm(0, 0));
        System.out.println(perm(1, 0));
        System.out.println(perm(1, 1));
        System.out.println(perm(10, 0));
        System.out.println(perm(10, 10));

        System.out.println(perm(5, 6));


    }
}
