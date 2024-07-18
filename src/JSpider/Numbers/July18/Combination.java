package JSpider.Numbers.July18;
/*
        ncr   =      n!
                (n-r)! x r!
        4c2   =      4 !        = 4 x 3 x 2 !   =  4 x 3
                (4-2)!  x 2 !      2! x 2!         2 x 1
 */
public class Combination {
    public static void main(String[] args) {
        int n=4;
        int r=2;
        int comb=1;
        for (int i = 0; i < r ; i++) {
            comb=comb*(n-i)/(i+1);
        }
        System.out.println(comb);
    }

}
