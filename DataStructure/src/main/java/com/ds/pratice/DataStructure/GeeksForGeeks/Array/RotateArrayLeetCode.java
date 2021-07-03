package com.ds.pratice.DataStructure.GeeksForGeeks.Array;

public class RotateArrayLeetCode {

    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,4,5,6,7};

        rotate(nums, 3);
    }
    public static void rotate(int[] nums, int k) {
        k = k%nums.length;
        if(k ==0){
            return;
        }
        int len = nums.length;
        reverse(nums, 0, len-k-1);
        reverse(nums, len-k, nums.length -1);
        reverse(nums, 0, len -1);

        for(int i=0 ; i<len-1; i++){
            System.out.println(nums[i]);
        }

    }

    public static void reverse(int[] nums, int low, int high){
        while (low < high){
            int temp = nums[low];
            nums[low] =  nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }
}
