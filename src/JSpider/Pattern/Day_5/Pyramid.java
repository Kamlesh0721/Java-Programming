package JSpider.Pattern.Day_5;

public class Pyramid {
    public static void printPyramid(int rows) {
        int space = rows - 1;
        int star = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < star; k++) {
                System.out.print("*" + "   ");
            }
            space--;
            star++;
            System.out.println();
        }
    }

    public static void printDiamond(int rows) {
        int space = rows / 2 + 1;
        int star = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*" + "  ");
            }
            if (i < rows / 2) {
                space--;
                star += 2;
            } else {
                space++;
                star -= 2;
            }
            System.out.println();
        }
    }

    public static void printDamru(int rows) {
        int space = 0;
        int star = rows;
        int mid = rows / 2;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*" + "  ");
            }

            if (i < mid) {
                star -= 2;
                space++;
            } else {
                star += 2;
                space--;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int rows = 9;
//        printPyramid(rows);
//        printDiamond(rows);
        printDamru(rows);
    }
}
