package com.ds.pratice.DataStructure.Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashingProblem5 {
    public static void main(String args[])
    {
        List<Integer> array = Arrays.asList(3, 4, 7, 1, 2, 9, 8);
        HashingProblem5 hashingProblem5 = new HashingProblem5();
        hashingProblem5.hashingProblem5(array);
    }

    // Class to represent a pair
    class Pair
    {
        int first, second;
         Pair(int f,int s)
        {
            first = f; second = s;
        }
    };
    //Find four elements a, b, c and d in an array such that a+b = c+d  for ab = cd replace sum with product
    public  boolean hashingProblem5(List<Integer> array){
        Map<Integer, Pair> map = new HashMap<>(array.size());

        for(int i=0; i<array.size(); i++){
            for(int j =i+1; j<array.size(); j++){
                int first = array.get(i);
                int second = array.get(j);
                int sum =  first+ second;
                if(!map.containsKey(sum)){
                    map.put(sum, new Pair(first, second));

                }else {
                    System.out.println("[" +map.get(sum).first + "," +map.get(sum).second + "]" + "[" + first+ "," +second+ "]");
                    return true;

                }

            }
        }
        return false;
    }
}
