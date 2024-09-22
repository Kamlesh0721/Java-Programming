package JSpider.Array.Array_3;

import java.util.Arrays;

public class moveZeroes {
    private static void moveZeroesEnd(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count] = nums[i];
                count++;
            }
        }
        while (count < nums.length) {
            nums[count] = 0;
            count++;
        }
    }

    public static void moveZeroesEndPrettier(int[] nums) {
        int l = 0;
        int r = 0;

        while (l < nums.length && r < nums.length) {
            if (nums[r] != 0) {
                swap(nums, l, r);
                l++;
            }
            r++;
        }
    }

    public static void swap(int[] nums, int in1, int in2) {
        int temp = nums[in1];
        nums[in1] = nums[in2];
        nums[in2] = temp;
    }

    public static void main(String[] args) {
    int[] nums = {7, 0, 2, 6, 0, 4};

        System.out.println(Arrays.toString(nums));
//        moveZeroesEnd(nums);
        moveZeroesEndPrettier(nums);
        System.out.println(Arrays.toString(nums));
    }

}
