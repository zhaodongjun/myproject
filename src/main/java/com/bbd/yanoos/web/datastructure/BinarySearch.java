package com.bbd.yanoos.web.datastructure;

/**
 * 二分查找
 * Created by zhaodongjun on 2018/9/3 0003.
 */
public class BinarySearch {
    /**
     * 循环实现二分查找算法
     * @param array 已排好序的数组
     * @param key 需要查找的数
     * @return 找到该值在数组中的下标，否则为-1
     */
    static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        // 这里必须是 <=
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == key) {
                return mid;
            }
            else if (array[mid] < key) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;
    }

    /**
     * 递归实现二分查找
     * @param dataset
     * @param data
     * @param beginIndex
     * @param endIndex
     * @return
     */
    public static int binarySearch(int[] dataset,int data,int beginIndex,int endIndex){
        int midIndex = (beginIndex+endIndex)/2;
        if(data <dataset[beginIndex]||data>dataset[endIndex]||beginIndex>endIndex){
            return -1;
        }
        if(data <dataset[midIndex]){
            return binarySearch(dataset,data,beginIndex,midIndex-1);
        }else if(data>dataset[midIndex]){
            return binarySearch(dataset,data,midIndex+1,endIndex);
        }else {
            return midIndex;
        }
    }

    public static void main(String[] args) {
//        int[] arr = { 6, 12, 33, 87, 90, 97, 108, 561 };
//        System.out.println("循环查找：" + binarySearch(arr, 12));
//        System.out.println("递归查找："+binarySearch(arr,12,0,arr.length-1));

    }
}
