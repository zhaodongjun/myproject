package com.bbd.yanoos.web.algorithm;

import java.util.Arrays;

/**
 * Created by zhaodongjun on 2018/10/15 0015.
 */
public class SortAndSearchSolution {
    public static void main(String[] args) {
////        nums1 = [1,2,3,0,0,0], m = 3
////        nums2 = [2,5,6],       n = 3
//        int[] nums1 = new int[6];
//        nums1[0]=1;
//        nums1[1]=2;
//        nums1[2]=3;
//
//        int[] nums2 = new int[]{2,5,6};
//        merge(nums1,3,nums2,3);
//        System.out.println("nums1[]="+ Arrays.toString(nums1));
//        int[] nums = {2,0,2,1,1,0};
        int[] nums = {2,0,2,1,1,0,2,0,2,1,1,0,2,0,2,1,1,0,2,0};
        sortColors(nums);
        System.out.println("nums="+Arrays.toString(nums));
    }

    /**
     * just for push
     * keypoint:two index
     * @param nums
     */
    public static void sortColors(int[] nums) {
        int indexAsc = 0;
        int indexDesc = nums.length-1;
        int i = 0;
        while (i<=indexDesc){
            if(nums[i]==0){
                int tmp = nums[i];
                nums[i++]= nums[indexAsc];
                nums[indexAsc++]=tmp;
            }else if(nums[i]==2){
                int tmp = nums[i];
                nums[i]= nums[indexDesc];
                nums[indexDesc--]=tmp;
            }else {
                i++;
            }
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        for (int i = 1; i < nums1.length; i++) {
            int temp = nums1[i];
            int j;
            for (j = i-1; j >= 0&&temp<nums1[j]; j--) {
                nums1[j+1]=nums1[j];
            }
            nums1[j+1]=temp;
        }
    }
}
