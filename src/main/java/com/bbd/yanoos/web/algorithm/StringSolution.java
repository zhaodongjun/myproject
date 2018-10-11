package com.bbd.yanoos.web.algorithm;

/**
 * Created by zhaodongjun on 2018/10/11 0011.
 */
public class StringSolution {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println("output="+reverseString1(input));
    }

    public static String reverseString1(String s) {
        StringBuffer sb = new StringBuffer();
        for(int i=s.length();i>0;i--){
            String character= s.substring(i-1, i);
            sb.append(character);
        }
        return sb.toString();
    }
}
