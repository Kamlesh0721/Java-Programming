package JSpider.Numbers.SpecialNumbers_6;

public class AutomorphicNo {
    public static boolean isAutomorphicNO(int n) {
        String s = n + "";
        int temp = n * n;
        temp = temp % (int) Math.pow(10, s.length());
        return temp == n;
    }

    public static int countFirst100Automorphic() {
        int count = 0;
        for (int num = 1; num <= 100; num++) {
            if (isAutomorphicNO(num)) {
                System.out.print(num + " ");
                count++;
            }
        }
        System.out.println();
        return count;
    }

    public static void main(String[] args) {
//        System.out.println(isAutomorphicNO(25));

        System.out.println("Count : " + countFirst100Automorphic());
    }
}
