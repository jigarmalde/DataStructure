package com.ds.pratice.DataStructure.LeetCode.Array;

public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args){
        int[] nums = new int[]{0,0,1,1,1,1,2,3,3};

        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if(nums.length ==0)
            return 0;
        int firstPointer = 0;
        int secondPointer = 0;

        while (secondPointer < nums.length){
            if(nums[firstPointer] != nums[secondPointer]){
                firstPointer++;
                int temp  = nums[firstPointer];
                nums[firstPointer] = nums[secondPointer];
                nums[secondPointer] = temp;
            }
            secondPointer++;
        }

        return firstPointer+1;
    }


}
