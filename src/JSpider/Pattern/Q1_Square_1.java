package JSpider.Pattern;

public class Q1_Square_1 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        for (int i = 0; i < rows; i++) {  // For Rows
            for (int j = 0; j < cols; j++) {  // For Columns
                System.out.print(" * ");
            }
            System.out.println(); // For entering in next line
        }

    }
}
