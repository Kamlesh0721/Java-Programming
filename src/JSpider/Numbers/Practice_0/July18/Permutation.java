package JSpider.Numbers.Practice_0.July18;
/*
    nPr  =    n!
            (n-r)!
    8P3  =    8!   =  8 * 7 * 6 * 5!
            (5)!            5!

 */
public class Permutation {
    public static int getPermutation(int n,int r){
        int perm=1;
        for(int i=0;i<r;i++){
            perm=perm*n;
            n--;
        }
        return perm;
    }
    public static void main(String[] args) {
        System.out.println(getPermutation(10,10));
    }
}
