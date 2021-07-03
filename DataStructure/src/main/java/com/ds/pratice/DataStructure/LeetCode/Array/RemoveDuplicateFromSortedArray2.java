package com.ds.pratice.DataStructure.LeetCode.Array;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray2 {

    public static void main(String[] args){
        int[] nums = new int[]{1,1,1,2,2,3};

        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int i =0; int count =0;

        for(int j =0; j<nums.length; j++){
            count++;

            if(count <=2){
                nums[i++] = nums[j];
            }
            if(j == nums.length-1 || nums[j] != nums[j+1]){
                count =0;
            }
        }
        return i;
    }
}
