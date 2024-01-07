package com.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TwoSum {
    private static final Logger logger = Logger.getLogger(TwoSum.class.getName());


    public static void main(String[] args) {
        TwoSum twoSumObj = new TwoSum();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSumObj.solution(nums, target);


        logger.log(Level.INFO, () -> "Indices of the two numbers: " + result[0] + ", " + result[1]);

    }


    public int[] solution(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        // If no solution is found
        return new int[]{-1, -1};
    }
}
