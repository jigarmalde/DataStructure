package com.ds.pratice.DataStructure.Classes.Array;

public class Triplate {

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,3,4,2,3,4,4};
        int result = arr[0];

        for(int i = 1; i < arr.length; i++){
            result = result^arr[i];
        }

        System.out.println("Result " + result);

    }
}
