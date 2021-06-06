package com.ds.pratice.DataStructure.Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashingProblem1 {

    public static void main(String args[])
    {
        List<Integer> array = Arrays.asList(11,12,13,14,15,13,12,13);
        hashingProblem1(array);
    }


    //j-i should be minimum and a[i] == a[j]
    public static void hashingProblem1( List<Integer> array){
        Map<Integer, Integer> map = new HashMap<>();
        int mindiff = Integer.MAX_VALUE;
        int i =0;
        int j =0;

        for(int k=0; k < array.size(); k++){
            Integer value = map.get(array.get(k));
            if(value != null && mindiff > (k- value)){
                i = map.get(array.get(k));
                j= k;
                mindiff = k - value;
                map.put(array.get(k), k);
            }
            else {
                map.put(array.get(k), k);
            }
        }

        System.out.println(i);
        System.out.println(j);
        System.out.println(map);


    }
}
