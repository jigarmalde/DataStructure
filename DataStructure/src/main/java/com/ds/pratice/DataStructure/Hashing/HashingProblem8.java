package com.ds.pratice.DataStructure.Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashingProblem8 {

    public static void main(String args[])
    {
        List<Integer> array = Arrays.asList(1, 0, 0, 1, 0, 1);
        HashingProblem8 hashingProblem7 = new HashingProblem8();
        hashingProblem7.hashingProblem7(array);


    }

    //Count subarrays with equal number of 1’s and 0’s
    public void hashingProblem7(List<Integer> array){

        {
            int count=0;
            int sum=0;
            Map<Integer, Integer> map = new HashMap<>(array.size());
            for(int i=0; i<array.size(); i++){
                int num = array.get(i);
                if(num ==0){
                    sum = sum -1;
                }else {
                    sum = sum+1;
                }

                //If sum = 0, it implies number of 0's and 1's are
                //equal from arr[0]..arr[i]
                if (sum == 0)
                    count++;

                if (map.containsKey(sum))
                    count += map.get(sum);

                if (!map.containsKey(sum))
                    map.put(sum, 1);
                else
                    map.put(sum, map.get(sum) + 1);
            }
            System.out.println(count);

        }

    }
}
