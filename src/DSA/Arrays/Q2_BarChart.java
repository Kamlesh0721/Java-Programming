package DSA.Arrays;

import java.util.Scanner;
/*

Sample Input:
Enter Size of Array :
5
Enter Array Elements :
3
1
0
7
5

Output :
          *
          *
          *  *
          *  *
 *        *  *
 *        *  *
 *  *     *  *

 */
public class Q2_BarChart {
    public static void printBarChart(int[] bar) {
        // find largest element in array
        int largest = bar[0];
        for (int i = 1; i < bar.length; i++) {
            if (bar[i] > largest) {
                largest = bar[i];
            }
        }

        // printing bar chart
        while(largest>0) {
            for (int i = 0; i < bar.length; i++) {
                if (bar[i] >= largest) {
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
            largest--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take input from user
        System.out.println("Enter Size of Array :");
        int input = sc.nextInt();

        // create array
        int[] arr = new int[input];

        // inserting values in array
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < input; i++) {
            arr[i] = sc.nextInt();
        }

        // Printing Bar Chart
        printBarChart(arr);
    }
}
