package com.ds.pratice.DataStructure.Classes.Array;

public class EvenOddSegregation {

    public static void main(String[] args){
        int[] arr = new int[]{ 1,2,3,4,9,13,5,6,8};

        evenOddSegregation1(arr);
    }
    private static void evenOddSegregation1(int[] arr) {
        int i =0;
        int j =0;

        while(j != arr.length){
            if(arr[j] %2 ==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }

        for (int k: arr){
            System.out.println(k);
        }

    }

    private static void evenOddSegregation(int[] arr) {

        int even=0;
        int odd=arr.length-1;
        int mid=0;
        int temp=0;
        while (mid<=odd){
            if(arr[mid]  % 2 ==0){
                temp = arr[even];
                arr[even] = arr[mid];
                arr[mid] = temp;
                even++;
                mid++;
            }else {
                temp = arr[odd];
                arr[odd] = arr[mid];
                arr[mid] = temp;
                odd--;
            }
        }

        //Arrays.asList(arr).stream().forEach(x -> System.out.println(x));

        for (int i: arr){
            System.out.println(i);
        }

    }
}


//Another way is count0 , count1, count2...