package Leetcode.Array.concatenationOfArray1929;

public class getConcatenation {
    public int[] getConcat(int[] nums) {
        // Get the length of nums
        int n = nums.length;

        // init the size of our array to be 2x the size to accommodate our copy
        int[] ans = new int[2 * n];

        // Loop
        for (int i = 0; i < n; i++) {
            // Copy each element of nums to the first half of ans
            ans[i] = nums[i];
            // Copy each element of nums to the second half of ans
            ans[i + n] = nums[i];
        }

        // Return the concat array
        return ans;
    }
}

// solution 2

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        System.arraycopy(nums, 0, ans, 0, n);
        System.arraycopy(nums, 0, ans, n, n);

        return ans;
    }
}
