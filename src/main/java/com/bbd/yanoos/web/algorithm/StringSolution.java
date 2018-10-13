package com.bbd.yanoos.web.algorithm;

import java.util.Arrays;

/**
 * Created by zhaodongjun on 2018/10/11 0011.
 */
public class StringSolution {
    public static void main(String[] args) {
//        String input = "A man, a plan, a canal: Panama";
//        System.out.println("output="+reverseString2(input));
        int x = -1435343488;
//        int x = 123;
        System.out.println("reverse="+reverse(x));
    }

    public static int reverse(int x) {
        int INT_MIN = Integer.MIN_VALUE;
        int INT_MAX = Integer.MAX_VALUE;
        long res = 0;
        while (x!=0){
            res = res*10 + x%10;
            x /= 10;
        }
        if(res > INT_MAX || res <INT_MIN){
            return 0;
        }
        return (int)res;
    }

    public static int reverseInteger1(int n) {
        int res = 0;
        while (n != 0) {
            int t = res * 10 + n % 10;
            if (t / 10 != res) return 0;
            res = t;
            n /= 10;
        }
        return res;
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
