package JSpider.Pattern;

public class Q1_Square_1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("--------------------------");

        int rows = 7;
        int cols = 3;
        for (int i = 0; i < rows; i++) {  // For Rows
            for (int j = 0; j < cols; j++) {  // For Columns
                System.out.print(" * ");
            }
            System.out.println(); // For entering next line
        }
        System.out.println("--------------------------");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }
        System.out.println("--------------------------");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
