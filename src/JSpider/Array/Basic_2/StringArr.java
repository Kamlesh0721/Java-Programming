package JSpider.Array.Basic_2;

public class StringArr {
    //    For the given array of Strings, print and count all the Strings which has even number of characters.
    public static void evenCharStr(String[] strArr) {
        int count = 0;
        for (String str : strArr) {

            if (str.length() % 2 == 0) {
                System.out.println(str);
                count++;
            }
        }
        System.out.println("Total even character String : " + count);
    }

    //For the given array of Strings, print the largest string and smallest string.
    public static void largestAndSmallestString(String[] strArr) {
        String largest = strArr[0];
        String smallest = strArr[0];
        for (int i = 1; i < strArr.length; i++) {
            String str = strArr[i];
            if (str.length() > largest.length()) {
                largest = str;
            }
            if (str.length() < smallest.length()) {
                smallest = str;
            }
        }
        System.out.println("Largest String is : " + largest);
        System.out.println("Smallest String is : " + smallest);
    }

    public static void main(String[] args) {
        String[] strArr = {"Yamaha", "TVS", "Honda", "Bajaj", "Hero", "Triumph", "BMW"};
        evenCharStr(strArr);
        largestAndSmallestString(strArr);
    }
}
