package JSpider.Numbers.Maths_8;

public class LCM {
    public static int largestNo(int n1, int n2, int n3) {
        return Math.max(n1, Math.max(n2, n3));

    }

    public static int LCMof(int n1, int n2, int n3) {
        int max = largestNo(n1, n2, n3);
        int ans = max;
        while (true) {
            if (ans % n1 == 0 && ans % n2 == 0 && ans % n3 == 0) {
                return ans;
            }
            ans += max;
        }
    }

    public static void main(String[] args) {
        System.out.println(LCMof(12, 15, 20));
    }
}
