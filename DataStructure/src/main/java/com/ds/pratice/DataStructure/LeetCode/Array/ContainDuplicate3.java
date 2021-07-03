package com.ds.pratice.DataStructure.LeetCode.Array;

import java.util.HashMap;
import java.util.Map;

public class ContainDuplicate3 {
    public static void main(String[] args) {
        int[] nums = new int[]{8,7,15,1,6,1,9,15};

        System.out.println(containsNearbyAlmostDuplicate(nums, 1, 3));
    }

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int numk = Math.abs(map.get(nums[i]) - i);
                int numt = 0;
                if (numk <= k && numt <= t) {
                    return true;
                }
                map.put(nums[i], i);
            } else {
                map.put(nums[i], i);
                /*int numk = Math.abs(map.get(nums[i]) - i);
                int numt = 0;
                if(numk <= k && numt <= t){
                    return true;
                }*/
            }

        }

        return false;
    }
}
