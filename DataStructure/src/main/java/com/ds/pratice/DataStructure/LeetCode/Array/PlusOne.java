package com.ds.pratice.DataStructure.LeetCode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PlusOne {

    public static void main(String[] args){
        int[] nums = new int[]{1,9,9,9};

        System.out.println(Arrays.toString(plusOne(nums)));
    }

    public static int[] plusOne(int[] digits) {
       /* int carry = 1;
        List<Integer> integers = new LinkedList<>();


        for (int i = digits.length - 1; i >= 0; i--) {
          int sum = digits[i] + carry;
          carry= (sum > 9) ?1:0;
          integers.add(0, sum%10);
        }

        if(carry > 0)
            integers.add(0, 1);

        return  integers.stream().mapToInt(x -> x).toArray();*/
        for(int i= digits.length-1 ; i>=0; i--){
            if(digits[i] < 9){
                digits[i]+=1;
                return digits;
            }
            digits[i] = 0;
        }
        int res[] = new int[digits.length+1];
        res[0] = 1;
        return res;
    }
}
