package JSpider.Numbers.SpecialNumbers_6;

public class StrongNo {
    private static int factorial(int n) {
        int fact = 1;
        while (n > 0) {
            fact *= n;
            n--;
        }
        return fact;
    }

    private static boolean isStrong(int n) {
        int sum = 0;
        int tempN = n;
        while (tempN > 0) {
            int unitDigit = tempN % 10;
            sum += factorial(unitDigit);
            tempN /= 10;
        }
        return sum == n;
    }

    public static int strongNoCount100() {
        int count = 0;
        for (int num = 1; num <= 100; num++) {
            if (isStrong(num)) {
                System.out.print(num + " ");
                count++;
            }
        }
        System.out.println();
        return count;
    }

    public static void main(String[] args) {
        System.out.println(isStrong(145));
        System.out.println("Count : " + strongNoCount100());
    }
}
