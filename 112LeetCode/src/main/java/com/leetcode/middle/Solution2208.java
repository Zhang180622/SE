package com.leetcode.middle;

import java.util.PriorityQueue;

/* *
 * @Author: zhangsp
 * @Date: 2023/7/25 22:31
 * @Version: 1.0
 * @comment:
 */
public class Solution2208 {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<Double>((a, b) -> b.compareTo(a));
        for (int num : nums) {
            pq.offer((double) num);
        }
        int res = 0;
        double sum = 0;
        for (int num : nums) {
            sum += num;
        }
        double sum2 = 0.0;
        while (sum2 < sum / 2) {
            double x = pq.poll();
            sum2 += x / 2;
            pq.offer(x / 2);
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        PriorityQueue<Double> pq = new PriorityQueue<Double>((a, b) -> b.compareTo(a));
        int[] nums = {5,8,1,19};
        for (int num : nums) {
            pq.offer((double) num);
        }
        System.out.println(pq.size());
        System.out.println(pq.toString());
    }
}
