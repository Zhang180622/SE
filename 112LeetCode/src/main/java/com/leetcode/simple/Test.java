package com.leetcode.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* *
 * @Author: zhangsp
 * @Date: 2023/7/15 22:51
 * @Version: 1.0
 * @comment: 所有Solution类的客户端
 */
public class Test {
    private static final Logger logger = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        /*
        Solution1 solution1 = new Solution1();
        int[] nums4 = new int[]{2,5,5,11};
        int target4 = 10;//{1,2}或{2,1}
        logger.info(solution1.twoSumV1(nums4,target4)[0] + " " + solution1.twoSumV1(nums4,target4)[1]);
        logger.info(solution1.twoSumV2(nums4,target4)[0] + " " + solution1.twoSumV2(nums4,target4)[1]);*/

        Solution9 solution9 = new Solution9();
        int x = 121;
        logger.info(String.valueOf(solution9.isPalindromeV5(x)));

    }
}
