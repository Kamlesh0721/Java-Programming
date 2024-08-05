package JSpider.Numbers.Practice_0;

import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {
        // Generate any 4 digit random number using Random class
        Random r=new Random();
        int start=1000;
        int end=9999;
        int num= start+r.nextInt(end - start);  // * imp
        System.out.println("Number : "+num);
    }
}
