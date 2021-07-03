package com.ds.pratice.DataStructure.LeetCode.Array;

public class BestTimeToBSStockLeetCode2 {

    public static void main(String[] args){
        int[] nums = new int[]{7,1,5,3,6,4};

        System.out.println(maxProfit(nums));
    }

    public static int maxProfit(int[] prices) {
        int maxprofit =0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i< prices.length; i++){
            if(prices[i] < min ){
               min = prices[i];
            }else if(maxprofit < (prices[i] - min)){
                maxprofit = prices[i] - min;
            }

        }

        return maxprofit;
    }
}
