package JSpider.Numbers.Number_9;

public class Replace7By0 {
    // Without Using String
    public static int len(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static int pow(int a, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 10;
        }
        return a * pow(a, --n);
    }

    public static int replace7By0(int n) {
        int ans = 0;
        int len = len(n);
        int lastPlace = pow(10, len - 1);
        while (n > 0) {
            int lastDigit = n / lastPlace;
            if (lastDigit == 7) {
                lastDigit = 0;
            }
            ans = ans * 10 + lastDigit;
            n = n % lastPlace;
            lastPlace /= 10;
        }
        return ans;
    }

    // With using String
//    public static String replace7By0(int n) {
//        String ans = "";
//        String num = Integer.toString(n);
//        for (int i = 0; i < num.length(); i++) {
//            char currC = num.charAt(i);
//            if (currC == '7') {
//                currC = '0';
//            }
//            ans += currC;
//        }
//        return ans;
//    }

    public static void main(String[] args) {
        System.out.println(replace7By0(41072707));
    }

}
