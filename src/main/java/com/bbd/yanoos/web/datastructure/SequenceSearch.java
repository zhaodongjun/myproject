package com.bbd.yanoos.web.datastructure;

/**
 * 顺序查找
 * Created by zhaodongjun on 2018/9/4 0004.
 */
public class SequenceSearch {
    static int sequenceSearch(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(""+sequenceSearch(arr,5));
    }
}
