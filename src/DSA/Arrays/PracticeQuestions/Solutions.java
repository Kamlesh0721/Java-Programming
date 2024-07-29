package DSA.Arrays.PracticeQuestions;

public class Solutions {
    public static int smallestNo(int n) {
        int smallest = 9;
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit < smallest) {
                smallest = lastDigit;
            }
            n /= 10;
        }
        return smallest;
    }

    public static int largestNo(int n) {
        int largest = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit > largest) {
                largest = lastDigit;
            }
            n /= 10;
        }
        return largest;
    }

    public static int findPIN(int input1, int input2, int input3, int input4) {
        return smallestNo(input1) * largestNo(input2) * smallestNo(input3) - input4;
    }

    public static void main(String[] args) {
        System.out.println(findPIN(3521,2452,1352,38));
    }
}
