package JSpider.Recursion.Day_4;
// get sum of 100 natural number by using recursion

public class Ques3 {
    static int getSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + getSum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(getSum(100));
    }
}
