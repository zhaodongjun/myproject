package com.bbd.yanoos.web.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by zhaodongjun on 2018/9/27 0027.
 */
public class Solution {
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
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("length="+removeDuplicates(nums));

    }

//    public static int removeDuplicates(int[] nums) {
//        if(nums==null){
//            return 0;
//        }
//        int length = nums.length;
//        int duplicate = 0;
//        for(int i=1;i<length;i++){
//            int cunt = 0;
//            while(cunt <= length-i && nums[i]==nums[i-1]){
//                cunt++;
//                for(int j=i;j<length-1;j++){
//                    nums[j]=nums[j+1];
//                }
//            }
//        }
//        for(duplicate=1;duplicate<length;duplicate++){
//            if(nums[duplicate]==nums[duplicate-1]){
//                break;
//            }
//        }
//        for(int k=0;k<duplicate;k++){
//            System.out.println("nums[]="+nums[k]);
//        }
//        return duplicate;
//    }

//    public static int[] stringToIntegerArray(String input) {
//        input = input.trim();
//        input = input.substring(1, input.length() - 1);
//        if (input.length() == 0) {
//            return new int[0];
//        }
//
//        String[] parts = input.split(",");
//        int[] output = new int[parts.length];
//        for(int index = 0; index < parts.length; index++) {
//            String part = parts[index].trim();
//            output[index] = Integer.parseInt(part);
//        }
//        return output;
//    }
//
//    public static String integerArrayToString(int[] nums, int length) {
//        if (length == 0) {
//            return "[]";
//        }
//
//        String result = "";
//        for(int index = 0; index < length; index++) {
//            int number = nums[index];
//            result += Integer.toString(number) + ", ";
//        }
//        return "[" + result.substring(0, result.length() - 2) + "]";
//    }
//
//    public static String integerArrayToString(int[] nums) {
//        return integerArrayToString(nums, nums.length);
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String line;
//        while ((line = in.readLine()) != null) {
//            int[] nums = stringToIntegerArray(line);
//
//            int ret = new Solution().removeDuplicates(nums);
//            String out = integerArrayToString(nums, ret);
//
//            System.out.print(out);
//        }
//    }

}
