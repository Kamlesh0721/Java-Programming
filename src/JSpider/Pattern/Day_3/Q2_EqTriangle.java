package JSpider.Pattern.Day_3;

public class Q2_EqTriangle {
    public static void main(String[] args) {
        int rows = 5;
        printTriangle(rows);
    }

    private static void printTriangle(int rows) {
        int space = rows - 1;
        int stars = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            space--;
            stars += 2;
            System.out.println();
        }

    }
}
