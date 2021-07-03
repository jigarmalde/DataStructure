package com.ds.pratice.DataStructure.GeeksForGeeks.Array;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ReaarangePosNeg {

    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, -4, -1, 4 };
        int arr_size = arr.length;

        reaarangePosNeg(arr, arr_size);
    }

    private static void reaarangePosNeg(int[] arr, int arr_size) {
        Set<Integer> integers = new TreeSet<>();
        int count = 0;
        for(int i=0; i<arr_size; i++){
           integers.add(arr[i]);
           if(arr[i] < 0){
               count++;
           }
        }
        System.out.println(integers);
        System.out.println(count);
        //arr[0] = integers[0];
        for (int i= 0; i < count*2-1; i++){

        }
    }

}
