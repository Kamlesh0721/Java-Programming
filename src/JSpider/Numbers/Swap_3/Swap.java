package JSpider.Numbers.Swap_3;

public class Swap {

    public static void main(String[] args) {
        // swap using third variable
        int a = 5;
        int b = 10;
        System.out.println(a + "  " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println(a + "  " + b);

        // swap without using third variable
        int x = 5;
        int y = 10;
        System.out.println(x + " " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(x + "  " + y);
    }

}
