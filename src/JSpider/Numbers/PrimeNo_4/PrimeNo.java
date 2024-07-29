package JSpider.Numbers.PrimeNo_4;

/*
When checking if a number  n  is prime, we only need to test divisors up to the square root of  n  because of the properties of factors and multiplication. Here's why:

### Explanation

1. **Factor Pairs**:
   Every composite number  n can be factored into two factors,  a  and b , such that  n = a x b . These factors are either both less than or equal to sqrt{n}, or one is greater than sqrt{n} and the other is less than sqrt{n}.

2. **Smallest Factor**:
   If  n  can be factored into  n = a x b , and both a  and  b  were greater than sqrt{n}, then a x b would be greater than  n , which is a contradiction. Therefore, at least one of these factors must be less than or equal to sqrt{n}.

3. **Efficiency**:
   By checking for factors only up to sqrt{n}, we ensure that we have checked all possible smaller factors that could divide  n  without remainder. If no such factors exist,  n  must be prime.

### Example

Consider the number 36:
- The square root of 36 is 6.
- The factors of 36 are (1, 36), (2, 18), (3, 12), (4, 9), and (6, 6).
- Notice that after 6, the factors repeat in reverse order. Thus, checking beyond 6 would be redundant.
 */
public class PrimeNo {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // * IMP *
    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            int unitDigit = n % 10;
            sum += unitDigit;
            n /= 10;
        }
        return sum;
    }

    public static void primeRangeWithDigit(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i) && isPrime(digitSum(i))) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("Count : " + count);
    }


    public static void main(String[] args) {
//        System.out.println(isPrime(59));

//        primeRange(1, 1000);
//        System.out.println();
//
        primeRangeWithDigit(1, 1000);

    }
}
