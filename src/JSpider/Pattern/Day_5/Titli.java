package JSpider.Pattern.Day_5;

public class Titli {
    public static void printTitle(int rows) {
        int mid = rows / 2;
        for (int i = 0; i < rows; i++) {
            for (int j =0; j < rows; j++) {
                if (j <= i && j<=mid|| j >= rows - i-1  ){
                    System.out.print("*"+"  ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int rows = 7;
        printTitle(rows);
    }
}