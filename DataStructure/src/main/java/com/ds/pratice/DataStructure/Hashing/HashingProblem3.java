package com.ds.pratice.DataStructure.Hashing;

import java.util.Arrays;
import java.util.List;

public class HashingProblem3 {
    public static void main(String args[])
    {
        List<Integer> array = Arrays.asList(100,4,5,20,99,10,3,6,101);
        hashingProblem3(array);
    }

    // find longest subarray from the given array  or longest chain of consecutives element
    public static void hashingProblem3(List<Integer> array){
        int count = 0;
        int max = 0;
        String temp = null;
        String subarray = null;
        //List<String> list = new ArrayList<>();

        for(int i : array){
            count =0;
            int number =i;
            if(!array.contains(number-1)){
                count +=1;
                temp = String.valueOf(number);
                ++number;
                while(array.contains(number)){
                    count+=1;
                    temp = temp.concat(" "+ String.valueOf(number));
                    ++number;
                }
                if(max <= count) {
                    max = count;
                    subarray = temp;
                   // list.add(temp);
                }
            }
        }

      System.out.println(subarray);
        System.out.println(max);

     }
}
