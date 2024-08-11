package JSpider;

class Solution {
    public static boolean isUgly(int n,int a,int b,int c){
        return n%a==0 || n%b==0 || n%c==0;
    }
    public static int nthUglyNumber(int n, int a, int b, int c) {
        int count=0;
        int i=0;
        int num=2;
        while(i<n){
            if(isUgly(num,a,b,c)){
                count++;
                i++;
            }
            if(count==n){
                return num;
            }
            num++;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(1000000000,2,217983653,336916467));
    }
}