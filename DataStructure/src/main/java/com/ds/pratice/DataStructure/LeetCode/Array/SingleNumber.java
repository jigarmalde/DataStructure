package com.ds.pratice.DataStructure.LeetCode.Array;

public class SingleNumber {
    public static void main(String[] args){
        int[] nums = new int[]{4,1,2,1,2};

        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int start = 0;
        if(nums.length ==1){
            return nums[0];
        }
        for(int i =0; i < nums.length; i++){
            start = start ^ nums[i];
        }
        return start;
    }

}
