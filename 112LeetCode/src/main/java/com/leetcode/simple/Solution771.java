package com.leetcode.simple;

/* *
 * @Author: zhangsp
 * @Date: 2023/7/24 21:31
 * @Version: 1.0
 * @comment:
 */
public class Solution771 {

    public int numJewelsInStones(String jewels, String stones) {
        char[] jewelsCharArr = jewels.toCharArray();
        char[] stonesCharArr = stones.toCharArray();
        int len1 = jewelsCharArr.length;
        int len2 = stonesCharArr.length;
        int sum = 0;
        for(int i = 0; i < len1; i++){
            int sum_i = 0;
            for(int j = 0; j < len2; j++){
                if(jewelsCharArr[i] == stonesCharArr[j]){
                    sum_i += 1;
                }
            }
            sum += sum_i;
        }
        return sum;
    }

}
