package JSpider.Numbers.Bits_1;

import java.util.Scanner;

public class CountBits_1 {
    public static String countBits(int n) {
        int bit0 = 0;
        int bit1 = 0;
        while (n > 0) {
            int currBit = n % 2;
            if (currBit == 0) {
                bit0++;
            } else {
                bit1++;
            }
            n = n / 2;
        }
        return "Bit 0 : " + bit0 + "\nBit 1 : " + bit1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();

        System.out.println(countBits(n));

    }
}
