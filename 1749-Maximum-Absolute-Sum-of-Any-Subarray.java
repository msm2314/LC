// LeetCode 1749: Maximum Absolute Sum of Any Subarray
// Approach: Prefix Sum
// Time Complexity: O(n)
// Auxiliary Space: O(1)

class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int maxi = 0;
        int mini = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
            maxi = Math.max(maxi, sum);
            mini = Math.min(mini, sum);
        }

        return maxi - mini;
    }
}
