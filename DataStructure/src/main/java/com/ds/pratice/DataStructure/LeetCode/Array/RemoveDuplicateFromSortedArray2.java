package com.ds.pratice.DataStructure.LeetCode.Array;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray2 {

    public static void main(String[] args){
        int[] nums = new int[]{-1,0,0,0,0,3,3};

        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if(nums.length ==0)
            return 0;
        int firstPointer = 0;
        int secondPointer = 0;

        while (secondPointer < nums.length){
            if(nums[firstPointer] != nums[secondPointer] ){
                if(secondPointer < nums.length && secondPointer+1 < nums.length & nums[firstPointer] ==
                        nums[firstPointer+1] && nums[secondPointer] == nums[secondPointer+1]){
                    firstPointer+=2;
                    int temp  = nums[firstPointer];
                    nums[firstPointer] = nums[secondPointer];
                    nums[secondPointer] = temp;

                    secondPointer+=1;
                    firstPointer++;
                    int temp1  = nums[firstPointer];
                    nums[firstPointer] = nums[secondPointer];
                    nums[secondPointer] = temp1;
                }else if(secondPointer < nums.length && secondPointer+1 < nums.length && nums[secondPointer] == nums[secondPointer+1]){
                    firstPointer++;
                    int temp  = nums[firstPointer];
                    nums[firstPointer] = nums[secondPointer];
                    nums[secondPointer] = temp;

                    secondPointer+=1;
                    firstPointer++;
                    int temp1  = nums[firstPointer];
                    nums[firstPointer] = nums[secondPointer];
                    nums[secondPointer] = temp1;

                }else if(firstPointer ==0 && nums[firstPointer] ==
                        nums[firstPointer+1]){
                    firstPointer+=2;
                    int temp  = nums[firstPointer];
                    nums[firstPointer] = nums[secondPointer];
                    nums[secondPointer] = temp;
                }
                else  {
                    firstPointer++;
                    int temp  = nums[firstPointer];
                    nums[firstPointer] = nums[secondPointer];
                    nums[secondPointer] = temp;
                }
            }

            secondPointer++;
        }

        if(firstPointer == 0 && nums.length > 1 && nums[firstPointer] == nums[firstPointer+1]){
            return 2;
        }

        return firstPointer+1;
    }
}
