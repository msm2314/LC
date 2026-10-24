// LeetCode 1749 — Maximum Absolute Sum of Any Subarray
// Brute force: enumerate all non-empty subarrays.
// Time: O(n²), extra space: O(1).
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                answer = Math.max(answer, Math.abs(sum));
            }
        }

        return answer;
    }
}
