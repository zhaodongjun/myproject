package com.bbd.yanoos.web.algorithm;

import java.util.Arrays;

/**
 * Created by zhaodongjun on 2018/10/11 0011.
 */
public class StringSolution {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println("output="+reverseString2(input));
    }

    public static String reverseString2(String s) {
        if(s==null||"".equals(s)){
            return s;
        }
        char[] chars = s.toCharArray();
        int left=0;
        int right=chars.length-1;
        while (left<right){
            char c = chars[left];
            chars[left++]=chars[right];
            chars[right--]=c;
        }
        return String.valueOf(chars);
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
