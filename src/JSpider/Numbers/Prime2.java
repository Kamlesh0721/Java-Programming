package JSpider.Numbers;
 // WAJP to count all the prime number in range where sum of all the digit is also prime number
public class Prime2 {
    static int getDigitSum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        return sum;
    }
    static boolean isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num=101;

        int start=2;
        int end=100;
        for(int i=start;i<=end;i++){
            if(isPrime(i) && isPrime(getDigitSum(i))){
                System.out.print(i+ " ");
            }
        }

    }
}
