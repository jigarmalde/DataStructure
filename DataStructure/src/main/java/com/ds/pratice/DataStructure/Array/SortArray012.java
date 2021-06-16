package com.ds.pratice.DataStructure.Array;

import java.util.Arrays;

public class SortArray012 {

    public static void main(String[] args){
        int[] arr = new int[]{ 0, 1, 2, 0, 1, 2};

        sortArray012(arr);
    }

    private static void sortArray012(int[] arr) {

        int low=0;
        int high=arr.length-1;
        int mid=0;
        int temp=0;
        while (mid<=high){
            switch (arr[mid]){
                case 0:{
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp;
                    high--;
                    break;
                }

            }
        }

        //Arrays.asList(arr).stream().forEach(x -> System.out.println(x));

        for (int i: arr){
            System.out.println(i);
        }

    }
}


//Another way is count0 , count1, count2...