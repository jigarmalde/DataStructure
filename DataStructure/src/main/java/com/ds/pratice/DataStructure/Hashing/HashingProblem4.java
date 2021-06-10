package com.ds.pratice.DataStructure.Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashingProblem4 {

    public static void main(String args[])
    {
        List<Integer> array = Arrays.asList(1, 5, 6, 0, -6, 3);
        hashingProblem4(array);
    }
    // find length of largest subarray with sum 0
    public static void hashingProblem4(List<Integer> array){
        Map<Integer, Integer> map = new HashMap<>(array.size());
        int sum=0;
        int maxLenght=0;

        for (int i=0; i<array.size(); i++){
            int number = array.get(i);
            sum+= number;
            if(map.containsKey(sum)){
                maxLenght  = (i - (int)map.get(sum) ) ;
            }
            else {
                map.put(sum, i);
            }

        }
        System.out.println(maxLenght);


    }
}
