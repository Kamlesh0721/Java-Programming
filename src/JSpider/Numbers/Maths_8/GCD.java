package JSpider.Numbers.Maths_8;

// GCD or HCF
public class GCD {
    public static int smallestNo(int n1, int n2, int n3) {
        return Math.min(n1, Math.min(n2, n3));
    }

    public static int HCFof(int n1, int n2, int n3) {
        int min = smallestNo(n1, n2, n3);
        int ans = min;
        while (ans >= 1) {
            if (n1 % ans == 0 && n2 % ans == 0 && n3 % ans == 0) {
                return ans;
            }
            ans--;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(HCFof(12, 18, 24));
    }
}
