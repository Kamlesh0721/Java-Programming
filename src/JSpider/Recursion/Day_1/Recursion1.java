package JSpider.Recursion.Day_1;

public class Recursion1 {
    static int count = 0;
    public static void test() {
        count++;
        System.out.println("Test method execution " + count);
        if (count <= 2) {
            System.out.println("Inside if block");
            test();
        } else {
            System.out.println("This is else block: " + count);
        }
        System.out.println("Last Line of test method: " + count);
    }

    public static void main(String[] args) {
        System.out.println("Main method starts");
        test();
        System.out.println("Main method ends");
    }


}
