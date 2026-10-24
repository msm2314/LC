// LeetCode 1749 — Prefix sum with minimum and maximum prefix values
// Track the largest positive and largest-magnitude negative subarray sums.
// Time: O(n), extra space: O(1).
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int prefix = 0;
        int minPrefix = 0;
        int maxPrefix = 0;
        int answer = 0;

        for (int num : nums) {
            prefix += num;

            answer = Math.max(answer, prefix - minPrefix);
            answer = Math.max(answer, maxPrefix - prefix);

            minPrefix = Math.min(minPrefix, prefix);
            maxPrefix = Math.max(maxPrefix, prefix);
        }

        return answer;
    }
}
