package JSpider.Numbers;
// 1   0   1   1   0
//2^4 2^3 2^2 2^1 2^0
public class NumberConversion {
    public static String getDecimalFromBinary(int n){
        int twoMul=1;
        int sum=0;
        while(n>0){
            int rem=n%10;
            if(rem==0|| rem==1){
            sum=sum+rem*twoMul;
            }
            else{
                return "Invalid Input";
            }
            twoMul=2*twoMul;
            n=n/10;
        }

        return sum+""; // convert int to String
    }
    public static String getOctalFromDecimal(int n){
        String result="";
        while(n>0){
            int rem=n%8;
            result=rem+result;// IMP
            n=n/8;
        }
        return result;
    }
    public static String getDecimalFromOctal(int n){
        int res=0;
        int mul8=1;
        while(n>0){
           int  rem=n%10;
           if(rem>7){
               return "This is not a valid octal Number";
           }
           res=res+mul8*rem;
           n=n/10;
           mul8=mul8*8;
        }
        return res+"";
    }
    public static String getHexaDecimalFromDecimal(int n){
        String res="";
        while(n>0){
            int rem=n%10;
            if(rem<=9){
                res=rem+res;
            }else{
                res=(char)(rem+87)+res;
            }
            n=n/10;
        }
        return res;
    }

    public static void main(String[] args) {
//        int n=10110;
//        System.out.println(getDecimalFromBinary(n));

//        System.out.println(getOctalFromDecimal(359));
//        System.out.println(getDecimalFromOctal(547));
        System.out.println(getHexaDecimalFromDecimal(2362));
    }
}
