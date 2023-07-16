package com.leetcode.simple;

/* *
 * @Author: zhangsp
 * @Date: 2023/7/16 7:43
 * @Version: 1.0
 * @comment: 回文数
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
   回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
    例如，121 是回文，而 123 不是。
    示例 1：
        输入：x = 121
        输出：true
    示例 2：
        输入：x = -121
        输出：false
        解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
    示例 3：
        输入：x = 10
        输出：false
        解释：从右向左读, 为 01 。因此它不是一个回文数。
    链接：https://leetcode.cn/problems/palindrome-number
 */
public class Solution9 {

    /* 个人思路
        num < 0; 负数一定不是回文数，因为倒置后最后一位一定不是-；
        0 <= num <= 9; 个位非负整数都是回文数；
        0 <= num; 整除10的一定不是回文数，因为倒置后第一位一定不是0；
          不能整除10的，转为字符串，根据中心对称相等即可；*/
    public boolean isPalindromeV1(int num){
        if(num < 0){
            return false;
        }
        else if(num >= 0 && num <= 9){
            return true;
        }else{
            if(num % 10 == 0){
                return false;
            }else{
                String stringNum = String.valueOf(num);
                int len = stringNum.length();
                char[] arrayNum = new char[len];
                for(int i = len - 1, k = 0; i >= 0; i--,k++){
                        arrayNum[k] = stringNum.charAt(i);
                }
                //字符数组转为字符串
                String string = new String(arrayNum);
                if(stringNum.equals(string)){
                    return true;
                }else{
                    return false;
                }
            }
        }
    }

    //V1演进版，初始化空字符串，累加得到反转后的字符串
    public boolean isPalindromeV2(int num){
        if(num < 0){
            return false;
        }
        else if(num >= 0 && num <= 9){
            return true;
        }else{
            if(num % 10 == 0){
                return false;
            }else{
                String stringNum = String.valueOf(num);
                int len = stringNum.length();
                char[] arrayNum = new char[len];
                String s = "";
                for(int i = len - 1, k = 0; i >= 0; i--,k++){
                    s += stringNum.charAt(i);
                }
                if(stringNum.equals(s)){
                    return true;
                }else{
                    return false;
                }
            }
        }
    }

    //V2优化版本，使用StringBuffer(String s).reverse().toString();得到完整反转的字符串
    public boolean isPalindromeV3(int num){
        if(num < 0){
            return false;
        }
        else if(num >= 0 && num <= 9){
            return true;
        }else{
            if(num % 10 == 0){
                return false;
            }else{
                String stringNum = String.valueOf(num);
                String reverseNum = new StringBuffer(stringNum).reverse().toString();
                if(stringNum.equals(reverseNum)){
                    return true;
                }else{
                    return false;
                }
            }
        }
    }

    public boolean isPalindromeV4(int x) {
        if(x<0){ return false; }
        String string = String.valueOf(x);
        int len = string.length();
        if(len == 1){
            return true;
        }
        if(len % 2 != 0 ){
            String sb = new StringBuffer(string.substring((len + 1)/2)).reverse().toString();
            return Integer.parseInt(string.substring(0,(len - 1)/2)) == Integer.parseInt(sb);
        }
        if(len % 2 == 0){
            String sb = new StringBuffer(string.substring(len/2)).reverse().toString();
            return Integer.parseInt(string.substring(0,len/2)) == Integer.parseInt(sb);
        }
        //return false; 与下面的抛参数不合法异常等同
        throw  new IllegalArgumentException();
    }

    //同个人思路，处理方式不同，建议参考
    public boolean isPalindromeV5(int x) {
        //一次性排除负数，大于0的10的倍数的数字
        if(x<0 || (x>0 && x%10==0)){ return false; }
        String string =String.valueOf(x);
        int len = string.length();
        //此处也可以不做判断，所有数字都直接转为字符串，然后与完全反转的字符串比较
        if(len == 1){
            return true;
        }else {
            String sb = new StringBuffer(string).reverse().toString();
            return string.equals(sb);
        }
    }

    //官方思路，数字的一半反转比较
    public boolean isPalindromeV6(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }
        int revertedNumber = 0;
        while (x > revertedNumber){
            revertedNumber  = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber/10;
    }
}
