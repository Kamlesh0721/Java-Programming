package JSpider.Numbers.Bits;

public class Shift_3 {
    public static String shift01(int n) {
        String result = "";
        while (n > 0) {
            int unitPlace = n % 10;
            if (unitPlace == 1) {
                result = result + unitPlace;
            } else {
                result = unitPlace + result;
            }
            n /= 10;
        }
        return result;
    }

    public static String shiftEvenOdd(int n) {
        String result = "";
        while (n > 0) {
            int unitPlace = n % 10;
            if (unitPlace % 2 == 0) {
                result = unitPlace + result;
            } else {
                result = result + unitPlace;
            }
            n /= 10;
        }
        return result;
    }

    public static String shiftEvenOddSameOrder(int n) {
        String result = "";
        String even = "";
        String odd = "";

        while (n > 0) {
            int unitPlace = n % 10;
            if (unitPlace % 2 == 0) {
                even = unitPlace + even;
            } else {
                odd = unitPlace + odd;
            }
            n /= 10;
        }
        result = even + odd;
        return result;
    }

    public static String shift0(int n) {
        String result = "";
        String other = "";
        while (n > 0) {
            int unitDigit = n % 10;
            if (unitDigit == 0) {
                result = unitDigit + result;
            } else {
                other = unitDigit + other;
            }
            n /= 10;
        }
        return result + other;
    }

    public static void main(String[] args) {
//        int n = 1010101010;
//        System.out.println(shift01(n));

//        System.out.println(shiftEvenOdd(253687));
//        System.out.println(shiftEvenOddSameOrder(253687));

        System.out.println(shift0(2030680));

    }
}
