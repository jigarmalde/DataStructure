package com.ds.pratice.DataStructure.GeeksForGeeks.Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashingProblem7 {

    public static void main(String args[])
    {
        List<Integer> array = Arrays.asList(0, 0, 1, 0, 1, 0, 1);
        HashingProblem7 hashingProblem67 = new HashingProblem7();
        hashingProblem67.hashingProblem7(array);
    }

    //Longest subarray having count of 1s equal to 0s
    public void hashingProblem7(List<Integer> array){
        int maxLength=0;
        int sum=0;
        int startindex=0;
        int endindex=0;
        Map<Integer, Integer> map = new HashMap<>(array.size());
        for(int i=0; i<array.size(); i++){
            int num = array.get(i);
            if(num ==0){
                sum = sum -1;
            }else {
                sum = sum+1;
            }
            if(sum ==0){
                maxLength = i+1;
                endindex = i;
            }
            if(!map.containsKey(sum))
                map.put(sum, i);

            if(map.containsKey(sum)){
                if(maxLength < (i- map.get(sum))){
                    maxLength = Math.max(maxLength, (i - map.get(sum)));
                    endindex = i;
                }
            }

        }
        startindex = endindex - maxLength+1;
        System.out.println(startindex + " to " + endindex);

        System.out.println(maxLength);

    }
}
