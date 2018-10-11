package com.bbd.yanoos.web.algorithm;

import java.util.Arrays;

/**
 * Created by zhaodongjun on 2018/9/27 0027.
 */
public class Solution {

    public static void main(String[] args) {
//        int[] nums = {0,0,1,1,1,2,2,3,3,4};
//        System.out.println("length="+removeDuplicates(nums));
//        int[] prices = {7,1,5,3,6,4};
//        System.out.println("maxProfit="+maxProfit(prices));
        int[] nums = {1,2,3,4,5,6,7};
        rotate3(nums,2);
        System.out.println("rotate="+ Arrays.toString(nums));
    }

//    Input: [1,2,3,4,5,6,7] and k = 3
//    Output: [5,6,7,1,2,3,4]
//    Explanation:
//    rotate 1 steps to the right: [7,1,2,3,4,5,6]
//    rotate 2 steps to the right: [6,7,1,2,3,4,5]
//    rotate 3 steps to the right: [5,6,7,1,2,3,4]
//    Example 2:
//
//    Input: [-1,-100,3,99] and k = 2
//    Output: [3,99,-1,-100]
//    Explanation:
//    rotate 1 steps to the right: [99,-1,-100,3]
//    rotate 2 steps to the right: [3,99,-1,-100]

    public static void rotate3(int[] nums, int k) {

    }

    /**
     * access
     * O(n)
     * @param nums
     * @param k
     */
    public static void rotate2(int[] nums, int k) {
        if(nums==null || nums.length==0 || nums.length==1 || k<1){
            return;
        }
        int[] numsNew = Arrays.copyOf(nums,nums.length);
        for(int i=0;i<nums.length;i++){
            int index = (i+k)%nums.length;
            nums[index]=numsNew[i];
        }
    }
    /**
     * Time Limit Exceeded
     * O(n²)
     * @param nums
     * @param k
     */
    public static void rotate1(int[] nums, int k) {
        if(nums==null || nums.length==0 || nums.length==1 || k<1){
            return;
        }
        for(int i=0;i<k;i++){
            int num = nums[nums.length-1];
            for(int j=nums.length-1;j>0;j--){
                nums[j]=nums[j-1];
            }
            nums[0]=num;
        }
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
