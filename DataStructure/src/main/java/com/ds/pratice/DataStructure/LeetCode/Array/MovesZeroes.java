package com.ds.pratice.DataStructure.LeetCode.Array;

import java.util.Arrays;

public class MovesZeroes {
    public static void main(String[] args){
        int[] nums = new int[]{0};

        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        int i =0;
        int j =0;
        while (j< nums.length){
            if(i !=j && nums[j] !=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }else if(nums[i] != 0) {
                i++;
            }
            j++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
