package JSpider.Recursion.Day_4;

public class Sum {
    public static int getSum(int n1, int n2) {
        return n1 + n2;
    }

    public static void main(String[] args) {
        int x = 50;
        int y = 60;
        int z = 70;
        int result = getSum(x, getSum(y, z));
        System.out.println(result);
    }
}
