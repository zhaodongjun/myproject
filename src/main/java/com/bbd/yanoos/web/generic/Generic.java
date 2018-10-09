package com.bbd.yanoos.web.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型
 * Created by zhaodongjun on 2018/9/26 0026.
 */
public class Generic<T>{
    //key这个成员变量的类型为T,T的类型由外部指定
    private T key;

    public Generic(T key) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        this.key = key;
    }

    public T getKey(){ //泛型方法getKey的返回值类型为T，T的类型由外部指定
        return key;
    }

    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add("aaaa");
        arrayList.add(100);

        for(int i = 0; i< arrayList.size();i++){
            String item = (String)arrayList.get(i);
            System.out.println("泛型测试,item = " + item);
        }
    }

}
