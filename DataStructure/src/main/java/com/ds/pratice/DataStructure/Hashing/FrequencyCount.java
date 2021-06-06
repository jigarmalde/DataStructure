package com.ds.pratice.DataStructure.Hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {

    public static void main(String args[])
    {
        int[] array = {11,12,13,14,15,12,13, 12};
        frequencyCount(array);

    }

    public static void frequencyCount(int[] array){
        Map<Integer, Integer> map = new HashMap<>();

        for(int a : array){
            if(map.get(a) != null){
                //Integer value = map.get(a) +1;
                map.put(a, map.get(a) +1);
            }
            else map.put(a,1);
        }

        System.out.println(map);

    }
}
