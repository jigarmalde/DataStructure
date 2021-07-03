package com.ds.pratice.DataStructure.LeetCode.Array;

import java.util.HashMap;
import java.util.Map;

public class ContainDuplicate2 {
    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,1,2,3};

        System.out.println(containsNearbyDuplicate(nums, 2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
         boolean flag = false;
         Map<Integer, Integer> map = new HashMap<>();
         for(int i =0; i< nums.length; i++){
             if(map.containsKey(nums[i])){
                 int num = Math.abs(map.get(nums[i]) - i);
                 if(num <= k){
                     return true;
                 }
                 map.put(nums[i], i);
             }else {
                 map.put(nums[i], i);
             }
         }
        return flag;
    }
}
