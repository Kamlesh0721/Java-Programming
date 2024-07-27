package JSpider.Pattern.Day_3;

public class Q1_Pattern_Assignment {
    public static void printPattern1(int rows) {
        int count = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++, count++) {
                System.out.print(count + "  ");
            }
            System.out.println();
        }
    }

    public static void printPattern2(int rows) {

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + "  ");
                } else {
                    System.out.print(0 + "  ");
                }
            }
            System.out.println();
        }
    }

    public static void printPattern3(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 != 0) {
                    System.out.print(1 + "  ");
                } else {
                    System.out.print(0 + "  ");
                }
            }
            System.out.println();
        }
    }

    public static void printPattern4(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (j <= rows - i) {
                    System.out.print("   ");
                } else if ((i + j) % 2 != 0) {
                    System.out.print(0 + "  ");
                } else {
                    System.out.print(1 + "  ");
                }
            }
            System.out.println();
        }
    }

    public static void printPattern5(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                if (j % 2 == 0) {
                    System.out.print(1 + "  ");
                } else {
                    System.out.print(0 + "  ");
                }
            }
            System.out.println();
        }
    }

    public static void printPattern6(int rows) {
        int val = 'A';
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print((char) val + "  ");
                val++;
            }
            System.out.println();
        }
    }

    public static void printPattern7(int rows) {
        int val = 'A';
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print((char) (val + j) + "  ");
            }
            System.out.println();
        }
    }

    public static void printPattern8(int rows) {
        int val = 'A';
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print((char) (val + i) + "  ");
            }
            System.out.println();
        }
    }

    public static void printPattern9(int rows) {
        int val = 'A';
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (j < rows - (i + 1)) {
                    System.out.print("   ");
                } else {
                    System.out.print((char) (val + i) + "  ");
                }
            }
            System.out.println();
        }
    }

    public static void printPattern10(int rows) {
        int val = 'A';
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= rows - (i + 1); j++) {
                System.out.print((char) (val + j) + "  ");
            }
            System.out.println();
        }
    }

    public static void printPattern11(int rows) {
        int val = 'A';
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (j == 0 || j == rows - 1 || i == 0 || i == rows - 1)
                    System.out.print((char) (val + i)+"  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Rows : ");
//        int rows = sc.nextInt();
        int rows = 5;

        printPattern1(rows);
        System.out.println("====================");
        printPattern2(rows);
        System.out.println("====================");
        printPattern3(rows);
        System.out.println("====================");
        printPattern4(rows);
        System.out.println("====================");
        printPattern5(rows);
        System.out.println("====================");
        printPattern6(rows);
        System.out.println("====================");
        printPattern7(rows);
        System.out.println("====================");
        printPattern8(rows);
        System.out.println("====================");
        printPattern9(rows);
        System.out.println("====================");
        printPattern10(rows);
        System.out.println("====================");
        printPattern11(rows);
    }
}
