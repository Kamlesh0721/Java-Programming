package JSpider.Pattern.Day_4;

public class Swastik {
    public static void printPattern(int rows) {
        int mid = rows / 2 + 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i == mid || j == mid || i == 1 && j > mid || j == 1 && i < mid || i == rows && j < mid || j == rows && i > mid) {
                    System.out.print("*" + "  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 5;
        printPattern(rows);
    }
}
