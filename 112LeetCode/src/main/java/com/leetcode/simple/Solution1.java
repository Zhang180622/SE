package com.leetcode.simple;

import java.util.HashMap;
import java.util.Map;

/* *
 * @Author: zhangsp
 * @Date: 2023/7/15 22:49
 * @Version: 1.0
 * @comment: 两数之和
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
   你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。你可以按任意顺序返回答案。
    示例 1：
        输入：nums = [2,7,11,15], target = 9
        输出：[0,1]
        解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
    示例 2：
        输入：nums = [3,2,4], target = 6
        输出：[1,2]
    示例 3：
        输入：nums = [3,3], target = 6
        输出：[0,1]
    链接：https://leetcode.cn/problems/two-sum
 */

public class Solution1 {
    /*暴力解法
    index[i]分别与index[j]相加，判断是否存在index[i] + index[j] == target，如果有结束并返回数组, 注意i和j的取值范围，以及i和j的关系。
    遍历所有元素，如果仍不满足，则 return new int[]{0,0};  */
    public int[] twoSumV1(int[] nums , int target){
        for(int i = 0 ; i < nums.length - 1 ; i++){
            for(int j = i + 1; j <= nums.length - 1 ; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
    }

    /* 查找表法
    将目标target-nums[i]的值逐步判断是否存在于表中，如果不存在则落表；否则及返回   */
    public int[] twoSumV2(int[] nums, int target) {
        int len = nums.length;
        Map<Integer,Integer> hashMap = new HashMap<>();
        //第一个元素，直接落入空表
        hashMap.put(nums[0],0);
        //从索引1开始判断，补值是否存在于hashMap中，存在则返回；否则落表即可
        for(int i = 1 ; i < len - 1 ; i++){
            int another = target - nums[i];
            if(hashMap.containsKey(another)){
                return new int[]{i, hashMap.get(another)};
            }
            hashMap.put(nums[i],i);
        }
        return new int[]{0,0};
    }

}
