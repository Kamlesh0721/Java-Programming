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
        return reverseString(str).equalsIgnoreCase(str);
    }

    public static boolean isPalindrome2(String str) {
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "KadddaK";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome2(str));
    }
}
