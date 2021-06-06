package com.ds.pratice.DataStructure.Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashingProblem2 {

    public static void main(String args[])
    {
        List<Integer> array = Arrays.asList(13,12,13,14,13,12,13, 13, 13, 13);
        hashingProblem1(array);
    }


    //count the number of pair created
    public static void hashingProblem1( List<Integer> array){
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> count = new HashMap<>();

        for(int k=0; k < array.size(); k++){
            Integer value = map.get(array.get(k));
            if(value != null){
                value = map.get(array.get(k));
                if(count.get(array.get(k)) == 1 || count.get(array.get(k)) == 2) {
                    map.put(array.get(k), value + 1);
                }else {
                    map.put(array.get(k), value + count.get(array.get(k)));
                }

                count.put(array.get(k), count.get(array.get(k))+1);
            }
            else {
                map.put(array.get(k), 1);
                count.put(array.get(k), 1);
            }
        }

        System.out.println(map);


    }
}
