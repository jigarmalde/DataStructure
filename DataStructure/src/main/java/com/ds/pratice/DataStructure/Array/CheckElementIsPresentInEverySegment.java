package com.ds.pratice.DataStructure.Array;

public class CheckElementIsPresentInEverySegment {

    public static void main(String[] args){
        int[] arr = new int[]{ 3, 5, 2, 4, 9, 2 ,1, 7, 3, 11, 12, 3};
        int x=3;
        int k=3;
        checkElementIsPresentInEverySegment(arr, x ,k, 0);
    }

    public static void checkElementIsPresentInEverySegment(int[] arr, int x, int k, int i){

        int count =0;
        for( i = i; i < k; i++){
            int num = arr[i];
            if(num != x){
              count++;
            }
        }
        if(count ==3){
            System.out.println("Not Present");
        }else {
            if(k != arr.length)
                checkElementIsPresentInEverySegment(arr, x ,k+k, k);
            else {
                System.out.println("Present");
            }
        }
    }
}
