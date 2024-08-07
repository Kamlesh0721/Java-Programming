package JSpider.Numbers.Number_9;

public class ReplaceOBy1 {

    public static int len(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static int pow(int n, int e) {
        if (e == 0) {
            return 1;
        }
        if (e == 1) {
            return n;
        }
        return n * pow(n, --e);
    }

    // without using string or any other method
    public static int replace0By1(int n) {
        int ans = 0;
        int len = len(n);
        int tempDiv = pow(10, len - 1);
        while (n > 0) {
            int firstDigit = n / tempDiv;
            if (firstDigit == 0) {
                firstDigit = 1;
            }
            ans = ans * 10 + firstDigit;
            n %= tempDiv;
            tempDiv /= 10;
        }

        return ans;
    }

//    // With using String
//    public static String replace0By1(int n) {
//        String ans = "";
//        while (n > 0) {
//            int lastDigit = n % 10;
//            if (lastDigit == 0) {
//                lastDigit = 1;
//            }
//            ans = lastDigit + ans;
//            n /= 10;
//        }
//        return ans;
//    }

    public static void main(String[] args) {
        System.out.println(replace0By1(41022005));
    }
}
