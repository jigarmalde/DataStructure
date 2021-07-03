package com.ds.pratice.DataStructure.LeetCode.Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumLeetCode {

    public static void main(String[] args){
        int[] nums = new int[]{2,7,11,15};

        twoSum(nums, 9);
    }

    public static void twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = null;
         for(int i=0; i< nums.length; i++){
             if(map.containsKey((target - nums[i]))){
                 System.out.println("["+ map.get((target - nums[i])) +","+ i +"]");
                 ans = new int[]{map.get((target - nums[i])) ,i};
             }else {
                 map.put(nums[i], i);
             }
         }


    }

}
