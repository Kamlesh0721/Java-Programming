package JSpider.Array.Array_3;

public class Sorted {
    public static boolean isSorted(int[] arr) {
        boolean isAscending = true;
        boolean isDescending = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                isDescending = false;
            }
            if (arr[i] < arr[i - 1]) {
                isAscending = false;
            }
            if(!isAscending && !isDescending){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(isSorted(arr));

    }
}
