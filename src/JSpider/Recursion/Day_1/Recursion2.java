package JSpider.Recursion.Day_1;

public class Recursion2 {
    public static void main(String[] args)
    {
        System.out.println("Main method starts");
        test(3);
        System.out.println("Main method ends");
    }
    public static void test(int n){
        System.out.println("Test method n is: "+n);
        if(n>0){
            System.out.println("Inside if block");
            test(n-1);
        }
        System.out.println("Last Line of test method: "+n);
    }
}
