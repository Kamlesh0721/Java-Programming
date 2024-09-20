package JSpider.String;

public class UniqueCharacters {
    public static String uniqueChar1(String str) {
        // There are total 256 character in java and their ascii value range from 0 to 255.
        int[] charOccur = new int[256];
        for (int i = 0; i < str.length(); i++) {
            charOccur[str.charAt(i)]++;
        }

        // print unique character
        String uniqueStr = "";
        for (int i = 0; i < charOccur.length; i++) {
            if (charOccur[i] >= 1) {
                uniqueStr += (char) i;
            }
        }
        return uniqueStr;
    }

    public static String uniqueChar2(String str) {
        char[] charArr = str.toCharArray();
        int n = charArr.length;
        String res = "";
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(charArr[i]==charArr[j]){
                    charArr[i]=charArr[n-1];
                    n--;
                    j--;
                }
            }
            res+=charArr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "ababcbed";
        System.out.println(uniqueChar1(str));

        // It will work but order will not be maintained
        System.out.println(uniqueChar2(str));
    }
}
