package com.bbd.yanoos.web.algorithm;

import java.util.*;

/**
 * Created by zhaodongjun on 2018/10/17 0017.
 */
public class ArrayAndStringSolution {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = threeSum(nums);
        for(List<Integer> list:lists){
            System.out.println("list="+ list.toString());
        }
    }

    /**
     * o(n³)
     * Time Limit Exceeded
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        nums.
        List<List<Integer>> listResult= new ArrayList<>();
        //nums = [-1, 0, 1, 2, -1, -4]
        int length = nums.length;
        for(int i=0;i<length-2;i++){
            for(int j=i+1;j<length-1;j++){
                for(int k=j+1;k<length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> listTmp = new ArrayList<>();
                        listTmp.add(nums[i]);
                        listTmp.add(nums[j]);
                        listTmp.add(nums[k]);
                        listTmp.sort(new Comparator<Integer>() {
                            @Override
                            public int compare(Integer o1, Integer o2) {
                                if(o2<o1){
                                    return 1;
                                }else if(o2==o1){
                                    return 0;
                                }else {
                                    return -1;
                                }
                            }
                        });

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
        return listResult;
    }

}
