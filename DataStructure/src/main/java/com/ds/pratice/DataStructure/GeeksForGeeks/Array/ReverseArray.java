package com.ds.pratice.DataStructure.GeeksForGeeks.Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr = new int[]{ 3, 5, 6, 2, 4};

        reverseArray(arr);
    }

    private static void reverseArray(int[] arr) {
        for(int i= arr.length-1; i>arr.length/2; i--){
            int first = arr[i];
            int last = arr[arr.length - i -1];

            arr[arr.length - i -1] = first;
            arr[i] = last;
        }

        Arrays.stream(arr).forEach(x -> System.out.println(x));
    }

}
