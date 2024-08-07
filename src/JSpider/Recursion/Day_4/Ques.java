package JSpider.Recursion.Day_4;

// Calculate biggest of 5 numbers by using recursion.
public class Ques {
    public static int getBig(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }

    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 3;
        int n3 = 20;
        int n4 = 23;
        int n5 = 12;
        System.out.println(getBig(getBig(n1, n2), getBig(n3, getBig(n4, n5))));
    }
}
