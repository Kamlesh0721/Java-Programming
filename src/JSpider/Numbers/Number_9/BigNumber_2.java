package JSpider.Numbers.Number_9;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

// Factorial of Number using BigInteger and BigDecimal
public class BigNumber_2 {

    public static BigInteger fact1(int n) {
        BigInteger fact = new BigInteger("1");
        for (int num = 2; num <= n; num++) {
            fact = fact.multiply(BigInteger.valueOf(num));
        }
        return fact;
    }

    public static BigDecimal fact2(int n) {
        BigDecimal fact = BigDecimal.ONE;
        for (int num = 2; num <= n; num++) {
            fact = fact.multiply(BigDecimal.valueOf(num));
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 500;
        System.out.println(fact1(n));
        System.out.println(fact2(n));
    }
}
