package com.ds.pratice.DataStructure.GeeksForGeeks.Array;

import java.util.HashMap;
import java.util.Map;

public class LargestSumContiguousSubArray {
    public static void main(String[] args) {
        int[] arr = new int[]{-2, -3, 4, -1, -2, 1, 5, -3};
        int n = arr.length;

        largestSumContiguousSubArray(arr, n);
    }

    private static void largestSumContiguousSubArray(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();

        int max=Integer.MIN_VALUE;
        int start =0;
        int end=0;
        int s=0;

        int sum =0;

        for(int i=0; i<n; i++){
             sum = sum +arr[i];
            if(max < sum){
                max = sum;
                start = s;
                end = i;
            }

            if(sum <0) {
                sum = 0;
                s = i+1;
            }
        }

        System.out.println(max);
        System.out.println(start);
        System.out.println(end);
    }

}
