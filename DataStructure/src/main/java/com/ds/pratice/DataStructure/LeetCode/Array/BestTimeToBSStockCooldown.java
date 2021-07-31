package com.ds.pratice.DataStructure.LeetCode.Array;

public class BestTimeToBSStockCooldown {
    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,0,2};
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
