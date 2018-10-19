package com.bbd.yanoos.web.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhaodongjun on 2018/10/17 0017.
 */
public class ArrayAndStringSolution {
    public static void main(String[] args) {
//        int[] nums = {-1, 0, 1, 2, -1, -4};
        int[] nums = new int[20000];
        for(int i=0;i<10000;i++){
           nums[i] = (int)(Math.random()*-100);
        }
        for(int i=10001;i<20000;i++){
            nums[i] = (int)(Math.random()*100);
        }
        List<List<Integer>> lists = threeSum(nums);
//        for(List<Integer> list:lists){
//            System.out.println("list="+ list.toString());
//        }
    }


    public static List<List<Integer>> threeSum(int[] nums) {
        System.out.println("start="+System.currentTimeMillis());
        List<List<Integer>> list = new ArrayList<>();
        //int[] nums = {-4, -1, -1, 0, 1, 2};
        Arrays.sort(nums);
//        int left = 0;
//        int right = 0;
        int length = nums.length;
        for(int i=0;i<length;i++){
            int firstNumber = nums[i];
            if(i==0 || firstNumber!=nums[i-1]){
                int targetNum = 0-firstNumber;
                int leftIndex=i+1;
                int rightIndex=length-1;
                while (leftIndex<rightIndex){
                    int twoNum = nums[leftIndex]+nums[rightIndex];
                    if(twoNum == targetNum){
                        List<Integer> listTmp = new ArrayList<>();
                        listTmp.add(firstNumber);
                        listTmp.add(nums[leftIndex]);
                        listTmp.add(nums[rightIndex]);
                        list.add(listTmp);
                        while (leftIndex<rightIndex&&nums[leftIndex]==nums[leftIndex+1]){
                            leftIndex++;
                        }
                        while (leftIndex<rightIndex&&nums[rightIndex-1]==nums[rightIndex]){
                            rightIndex--;
                        }
                        leftIndex++;
                        rightIndex--;
                    }else if(twoNum<targetNum){
                        leftIndex++;
                    }else {
                        rightIndex--;
                    }
                }
            }
        }
        System.out.println("end==="+System.currentTimeMillis());
        return list;
    }


    /**
     * o(n³)
     * Time Limit Exceeded
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum1(int[] nums) {
        System.out.println("start="+System.currentTimeMillis());
        Arrays.sort(nums);
        List<List<Integer>> listResult= new ArrayList<>();
        //nums = [-1, 0, 1, 2, -1, -4]
        int length = nums.length;
        for(int i=0;i<length-2;i++){
            if(nums[i]>=0){
                break;
            }
            for(int j=i+1;j<length-1;j++){
                for(int k=j+1;k<length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> listTmp = new ArrayList<>();
                        listTmp.add(nums[i]);
                        listTmp.add(nums[j]);
                        listTmp.add(nums[k]);

                        boolean boo = false;
                        for(int m=0;m<listResult.size();m++){
                            if(listResult.get(m).equals(listTmp)){
                                boo=true;
                                break;
                            }
                        }
                        if(!boo){
                            listResult.add(listTmp);
                        }
                    }
                }
            }
        }
        System.out.println("end==="+System.currentTimeMillis());
        return listResult;
    }

}
