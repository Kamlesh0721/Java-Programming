package JSpider.String;

public class PalindromeString {
    public static String reverseString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    public static boolean isPalindrome(String str) {
        return reverseString(str).equals(str);
    }

    public static void main(String[] args) {
        String str = "KaaK";
        System.out.println(isPalindrome(str));
    }
}
