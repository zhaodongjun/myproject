package com.bbd.yanoos.web.sort;

import java.util.Arrays;

/**
 * Created by zhaodongjun on 2018/9/6 0006.
 */
public class BubbleSort {
    static int[] bubbleSort(int[] arr){
        int length = arr.length;
        for(int i=0;i<length;i++){
            for(int j=0;j<length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,8,7,3,6,1,4};
        System.out.println("arr[]="+ Arrays.toString(bubbleSort(arr)));
    }
}

