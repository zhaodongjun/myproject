package com.bbd.yanoos.web.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by zhaodongjun on 2018/9/3 0003.
 */
public class BinarySearchTest {
//    给定一个升序排列的自然数数组，数组中包含重复数字，例如：[1,2,2,3,4,4,4,5,6,7,7]。
//
//    问题：给定任意自然数，对数组进行二分查找，返回数组正确的位置，给出函数实现。
//
//    注：连续相同的数字，返回第一个匹配位置还是最后一个匹配位置，由函数传入参数决定。

    /**
     * 返回全部符合条件的位置
     * @param arr
     * @param key
     * @return
     */
    static Integer[] findKeyIndex(int[] arr,int key){
        int left = 0;
        int right = arr.length-1;

        Arrays.sort(arr);

        ArrayList<Integer> list = new ArrayList();
        Integer[] index = {};
        while (left <= right){
            int mid = (left+right)/2;
            if(arr[mid] == key){
                list.add(mid);
                left = mid+1;
            }else if(arr[mid] < key){
                left = mid+1;
            }else {
                right = mid-1;
            }
        }

        left = 0;
        right = arr.length-1;
        boolean boo = true;
        while (left <= right){
            int mid = (left+right)/2;
            if(arr[mid] == key){
                if(!boo){
                    list.add(mid);
                }
                boo = false;
                right = mid-1;
            }else if(arr[mid] < key){
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        Collections.sort(list);//排序
        index = (Integer[])(list.toArray(new Integer[list.size()]));
        return index;
    }

    /**
     * 取key值所在位置索引
     * @param arr
     * @param key
     * @param sort ASC表示取最前一个，DESC表示取最后一个
     * @return
     */
    static int findKeyIndexBySort(int[] arr,int key,String sort){
        int left = 0;
        int right = arr.length-1;

        if(sort.equalsIgnoreCase("ASC")){
            while (left <= right){
                int mid = (left+right)/2;
                if(arr[mid] >= key){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
            if(left<arr.length && arr[left] == key){
                return left;
            }
        }else if(sort.equalsIgnoreCase("DESC")){
            while (left <= right){
                int mid = (left+right)/2;
                if(arr[mid] <= key){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
            if(right<arr.length && arr[right] == key){
                return right;
            }
        }else{
            return -2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,4,5,6,7,7};
//        Integer[] keyIndex = findKeyIndex(arr, 4);
//        System.out.println(Arrays.toString(keyIndex));

        int asc = findKeyIndexBySort(arr, 4, "ASC");
        int desc = findKeyIndexBySort(arr, 4, "DESC");

        System.out.println("asc="+asc);
        System.out.println("desc="+desc);


    }
}
