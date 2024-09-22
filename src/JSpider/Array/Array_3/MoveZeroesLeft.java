package JSpider.Array.Array_3;

import java.util.Arrays;

public class MoveZeroesLeft {
    public static void main(String[] args) {
        int[] nums={0, 0,0,1, 1,0, 1, 0,0,};
        System.out.println(Arrays.toString(nums));
        moveZeroesLeft(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void moveZeroesLeft(int[] nums) {
        int l=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                swap(nums,l,r);
                l++;
            }
        }
    }

    private static void swap(int[] nums, int l, int r) {
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
}
