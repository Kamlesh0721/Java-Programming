package JSpider.Numbers;

public class PalindromeAndPrime {
    static boolean isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static boolean isPalindrome(int n){
        int nTemp=n;
        int rev=0;
        while(nTemp>0){
            rev=rev*10+nTemp%10;
            nTemp=nTemp/10;
        }
        if(rev==n){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num=101;
        int start=2;
        int end=1000;
        for(int i=start;i<=end;i++){
            if(isPrime(i) && isPalindrome(i)){
                System.out.print(i+ " ");
            }
        }

    }
}
