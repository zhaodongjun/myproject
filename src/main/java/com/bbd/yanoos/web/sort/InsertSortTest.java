package com.bbd.yanoos.web.sort;

import java.util.Arrays;

/**
 * Created by zhaodongjun on 2018/9/10 0010.
 */
public class InsertSortTest {
    static int[] sort(int[] arr){
        int length = arr.length;
        int i,j;
        for(i=1;i<length;i++){
            for(j=i-1;j>=0&&arr[i]<arr[j];j--){
            }
            int tmp = arr[i];
            for(int k=i;k>j+1;k--){
                arr[k]=arr[k-1];
            }
            arr[j+1]=tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,54,51,7,90,11,5,17,32,18};
        System.out.println("arr="+ Arrays.toString(sort(arr)));
    }
}
