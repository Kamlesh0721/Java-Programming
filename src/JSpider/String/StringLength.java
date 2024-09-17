package JSpider.String;

public class StringLength {
    public static int length1(String str) {
        char[] charArr = str.toCharArray();
        int count = 0;
        for (char c : charArr) {
            count++;
        }
        return count;
    }

    public static  int length2(String str) {
        char[] charArr = str.toCharArray();
        return charArr.length;
    }

    public static int length3(String str) {
        str += '\0';
        int count = 0;
        for (int i = 0; str.charAt(i) != '\0'; i++) {
            count++;
        }
        return count;
    }

    public static int length4(String str) {
        str += '\0';
        return str.indexOf('\0');
    }

    public static void main(String[] args) {
        String str="hello world!";
        System.out.println(length1(str));
        System.out.println(length2(str));
        System.out.println(length3(str));
        System.out.println(length4(str));
    }
}
