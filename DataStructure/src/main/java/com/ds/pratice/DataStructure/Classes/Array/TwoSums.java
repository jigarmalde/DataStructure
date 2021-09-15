package com.ds.pratice.DataStructure.Classes.Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSums {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 7, 6};
        int targets = 9;

        int[] result = getInts(arr, targets);

        System.out.println(result[0] +" "+ result[1]);
    }

    private static int[] getInts(int[] arr, int targets) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(targets - arr[i])){
                return new int[]{map.get(targets - arr[i]), i};
            }else{
                map.put(arr[i], i);
            }
        }

        return new int[]{-1, -1};
    }
}
