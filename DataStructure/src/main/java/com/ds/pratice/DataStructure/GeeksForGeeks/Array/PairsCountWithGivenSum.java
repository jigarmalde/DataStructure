package com.ds.pratice.DataStructure.GeeksForGeeks.Array;

import java.util.HashMap;
import java.util.Map;

public class PairsCountWithGivenSum {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 12, 10, 15, -1, 7, 6,
                5, 4, 2, 1, 1, 1};
        int n = arr.length;
        int sum = 11;

        pairsCountWithGivenSum(arr, n, sum);
    }

    private static void pairsCountWithGivenSum(int[] arr, int n, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
       int count =0;
        for(int i=0; i<n; i++){
           int num = arr[i];
            if(map.containsKey(num)){
                map.put(num, map.get(num) +1);
            }else {
                map.put(num, 1);
            }
        }

        for(int i=0; i<n; i++){
            if(map.containsKey(sum - arr[i])){
                count = count + map.get(sum - arr[i]);
            }
        }

        System.out.println(count/2);
    }
}
