package com.bbd.yanoos.web.algorithm;

/**
 * Created by zhaodongjun on 2018/9/27 0027.
 */
public class Solution {

    public static void main(String[] args) {
//        int[] nums = {0,0,1,1,1,2,2,3,3,4};
//        System.out.println("length="+removeDuplicates(nums));
        int[] prices = {7,1,5,3,6,4};
        System.out.println("maxProfit="+maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        if(prices==null || prices.length==0 || prices.length==1){
            return 0;
        }
        int maxProfit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i-1]<=prices[i]){
                maxProfit = maxProfit+prices[i]-prices[i-1];
            }
        }
        return maxProfit;
    }

    public static int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }else if(nums.length==1){
            return 1;
        }
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }

}
