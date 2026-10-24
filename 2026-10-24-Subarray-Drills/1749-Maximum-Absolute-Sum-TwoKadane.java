// LeetCode 1749 — Maximum and minimum Kadane scans
// The maximum absolute sum is max(maxSubarraySum, -minSubarraySum).
// Time: O(n), extra space: O(1).
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxEnding = 0;
        int minEnding = 0;
        int maxSum = 0;
        int minSum = 0;

        for (int num : nums) {
            maxEnding = Math.max(0, maxEnding + num);
            maxSum = Math.max(maxSum, maxEnding);

            minEnding = Math.min(0, minEnding + num);
            minSum = Math.min(minSum, minEnding);
        }

        return Math.max(maxSum, -minSum);
    }
}
