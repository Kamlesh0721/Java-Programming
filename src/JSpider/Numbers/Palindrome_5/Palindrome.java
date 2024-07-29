package JSpider.Numbers.Palindrome_5;
// https://leetcode.com/problems/palindrome-number/description/
public class Palindrome {
    public static boolean isPalindrome(int n) {
        int temp = n;
        int rev = 0;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

//        return rev == n ? true : false;  // can be simplified
        return rev == n;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }
}
