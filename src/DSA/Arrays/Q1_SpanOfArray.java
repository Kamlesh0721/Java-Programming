package DSA.Arrays;
/*
Span of array= Array's largest element - Array's smallest element
 */
public class Q1_SpanOfArray {
    public static void main(String[] args) {
        int[] arr = {6, 15, 30, 40, 4, 11, 9};
        int largest = arr[0];
        int smallest = arr[0];
        for (int index = 1; index < arr.length; index++) {
            if (arr[index] > largest) {
                largest = arr[index];
            }
            else if (arr[index]<smallest) {
                smallest = arr[index];
            }
        }
        int span=largest-smallest;
        System.out.println("Span : "+largest+" - "+smallest+" = "+span);
    }
}
