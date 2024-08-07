package JSpider.Numbers.Practice_0;

public class PrimeIndexOfString {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void printPrimeIndex(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (isPrime(i + 1)) {
                System.out.print(s.charAt(i) + " ");
            }
        }
    }

    public static void main(String[] args) {
        printPrimeIndex("I love Programming");
    }
}
