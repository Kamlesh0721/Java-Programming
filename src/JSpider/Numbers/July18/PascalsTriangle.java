package JSpider.Numbers.July18;

public class PascalsTriangle {

    public static void main(String[] args) {
       printPascalsTriangle(5);
    }

    public static void printPascalsTriangle(int row){
        for (int i = 1; i <=row; i++) {
            // Print Spaces
            for(int j=0;j<row-i;j++) {
                System.out.print("  ");
            }
            // Print value
            printRow(i);
        }
    }
    // Print Row
   public static void printRow(int row){
        for(int i=0;i<row;i++){
            int comb=1;
            for(int j=0;j<i;j++) {
                comb = comb * (row - 1 - j) / (j + 1);
            }
            System.out.print(comb+"   ");
        }
       System.out.println();
   }
}
