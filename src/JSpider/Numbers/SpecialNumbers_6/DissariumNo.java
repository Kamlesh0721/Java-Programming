package JSpider.Numbers.SpecialNumbers_6;

public class DissariumNo {
    public static boolean isDissarium(int n) {
//        String s = n + "";
        String s = String.valueOf(n);
        int len = s.length();
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            sum += (int) Math.pow(temp % 10, len);
            temp /= 10;
            len--;
        }
        return sum == n;
    }

    public static int DissariumUpto1000() {
        int count = 0;
        for(int num=1;num<1000;num++){
            if(isDissarium(num)){
                System.out.print(num+" ");
                count++;
            }
        }
        System.out.println( );
        return count;
    }

    public static void main(String[] args) {
        int n = 175;
        System.out.println(isDissarium(n));

        System.out.println("Count :" + DissariumUpto1000());

    }
}
