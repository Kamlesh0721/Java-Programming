package JSpider.Numbers.Number_9;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class BigNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // BigInteger
        // User Input Big Integer
        System.out.println("Enter Big Number : ");
        BigInteger n1 = new BigInteger(sc.nextLine());

        BigInteger n2 = new BigInteger("1000000");

//        System.out.println(n1 + n2 );  // Error : Can not be applied to BigInteger
        System.out.println(n1);
        System.out.println(n2);

        // BigDecimal
        BigDecimal PI = new BigDecimal("3.14159265359");
        System.out.println("Enter Big Decimal Number : ");
        BigDecimal dn = new BigDecimal(sc.nextLine());
        System.out.println(PI);
        System.out.println(dn);
    }
}
