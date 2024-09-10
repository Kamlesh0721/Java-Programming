package JSpider.Array.Basic_1;

public class Array_1 {
    public static void main(String[] args) {
        int[] arr = {12, 3, 232, 4, 324, 23, 45, 76, 89, 76, 89, 90};

        // print even index element
//        for (int i=2;i<arr.length;i+=2){
//            System.out.printf("%-2d : %-3d \n",i,arr[i]);
//        }

//         print even elements of array
//        for (int num : arr) {
//            if (num % 2 == 0)
//                System.out.print(num+ " ");
//        }

        // count all even numbers of array
//        int count = 0;
//        for (int num : arr) {
//            if (num % 2 == 0) {
//                count++;
//            }
//        }
//        System.out.println("All even numbers in array are : " + count);

        // count all the three digit numbers of array
//        for(int num: arr){
//            if(num>=100 && num<=999){
//                System.out.print(num+" ");
//            }
//        }

        // sum and average of all elements of array
//        int sum = 0;
//        for (int num : arr) {
//            sum += num;
//        }
//        System.out.println("sum : " + sum);
//        System.out.println("average : " + (double)sum / arr.length);

        // Biggest element , Smallest element and their difference
        int biggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num > biggest) {
                biggest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println("Biggest : " + biggest);
        System.out.println("Smallest  : " + smallest);
        System.out.println("Biggest - Smallest : " + (biggest - smallest));
    }
}

