package JSpider.Numbers.SpecialNumbers_6;

public class ArmstrongNumber {
    public static boolean isArmstrong(int n) {
        int sum = 0;
        int tempN = n;
        while (tempN > 0) {
            int unitDigit = tempN % 10;
            sum += unitDigit * unitDigit * unitDigit;
            tempN /= 10;
        }

        return sum == n;
    }

    public static int countFirst100ArmstrongNumber() {
        int count = 0;
        for (int num = 1; num <= 100; num++) {
            if (isArmstrong(num)) {
                System.out.print(num + " ");
                count++;
            }
        }
        System.out.println();
        return count;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println("Count : " + countFirst100ArmstrongNumber());
    }
}
