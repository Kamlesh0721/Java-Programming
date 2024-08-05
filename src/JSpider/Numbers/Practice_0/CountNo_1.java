package JSpider.Numbers.Practice_0;

import java.util.Scanner;

public class CountNo_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ");
        int num = sc.nextInt();

        // Count Digits
//        System.out.println(countDigit(num));

        // Reverse Number.
//        System.out.println(reverseNo(num));

        // Palindrome Number.
//        System.out.println(isPalindrome(num));

        // Armstrong Number.
        System.out.println(isArmstrong(num));
    }


    public static int countDigit(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public static int reverseNo(int n) {
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int n) {
        int rev = reverseNo(n);
        if (n == rev) {
            return true;
        }
        return false;
    }

    private static boolean isArmstrong(int n) {
        // 153 = 1^3+5^3+3^3 or 35 = 3^2+5^2
        int nCopy=n;
        int digit=countDigit(n);
        int sum=0;
        while (n!=0){
            int last=n%10;
            sum=sum+(int)Math.pow(last,digit);
            n/=10;
        }
        if(sum==nCopy){
            return true;
        }
        return false;
    }
}
