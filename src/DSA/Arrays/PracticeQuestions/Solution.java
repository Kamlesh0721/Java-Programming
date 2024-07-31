package DSA.Arrays.PracticeQuestions;

import java.util.Scanner;

public class Solution {

    public static int[] maxRevenue(int[][] salesRecord) {
        int days = salesRecord.length;
        int[] answer = new int[days];

        // Iterate through each day's sales record
        for (int i = 0; i < days; i++) {
            int maxRevenue = Integer.MIN_VALUE;
            for (int j = 0; j < salesRecord[i].length; j++) {
                if (salesRecord[i][j] > maxRevenue) {
                    maxRevenue = salesRecord[i][j];
                }
            }
            answer[i] = maxRevenue;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input for number of days and products
        int salesRecord_row = in.nextInt();
        int salesRecord_col = in.nextInt();

        // Initialize the sales record matrix
        int[][] salesRecord = new int[salesRecord_row][salesRecord_col];

        // Input the sales records
        for (int i = 0; i < salesRecord_row; i++) {
            for (int j = 0; j < salesRecord_col; j++) {
                salesRecord[i][j] = in.nextInt();
            }
        }

        // Get the maximum revenue for each day
        int[] result = maxRevenue(salesRecord);

        // Print the result
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
