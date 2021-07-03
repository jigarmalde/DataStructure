package com.ds.pratice.DataStructure.GeeksForGeeks.Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashingProblem6 {

    public static void main(String args[])
    {
        List<Integer> array = Arrays.asList(0, 1);
        HashingProblem6 hashingProblem6 = new HashingProblem6();
        hashingProblem6.hashingProblem6(array);


    }

    //Longest subarray having count of 1s one more than count of 0s
    //For Longest subarray having count of 0s one more than count of 1s   sum<-1 and sum-1 do sum+1
    public void hashingProblem6(List<Integer> array){
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
            if(sum == 1 || sum > 1){
                maxLength = i+1;
                endindex =i;
            }
            if(!map.containsKey(sum))
                map.put(sum, i);

            if(map.containsKey(sum-1)){
                if(maxLength < (i- map.get(sum-1))) {
                    maxLength = Math.max(maxLength, (i - map.get(sum - 1)));
                    endindex =i;
                }
            }

        }
        startindex = endindex - maxLength+1;
        System.out.println(startindex + " to " + endindex);

        System.out.println(maxLength);

    }
}
