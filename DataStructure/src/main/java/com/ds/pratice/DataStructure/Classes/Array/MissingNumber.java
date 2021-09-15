package com.ds.pratice.DataStructure.Classes.Array;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = new int[]{2,1,4,7,6,5};
        int len = arr.length;

        //n(n+1)/2
        int sum = ((len+1) * (len+2))/2;


        for(int i = 0; i < arr.length; i++){
            sum = sum - arr[i];
        }

        System.out.println("Result " + sum);

    }
}
