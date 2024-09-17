package JSpider.String;

import java.util.Arrays;

public class uniqueChar {
    public static void main(String[] args) {
        String str = "abacbdeee";
        // There are total 256 character in java and their ascii value range from 0 to 255.
        int[] charOccur = new int[256];
        for (int i = 0; i < str.length(); i++) {
            charOccur[str.charAt(i)]++;
        }

        // print unique character
        String uniqueStr = "";
        for (int i = 0; i < charOccur.length; i++) {
            if (charOccur[i] >= 1) {
                uniqueStr += (char)i;
            }
        }
        System.out.println(uniqueStr);
    }
}
