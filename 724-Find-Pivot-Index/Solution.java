// LeetCode 724: Find Pivot Index
// Time: O(n), Space: O(1)

class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        int l = 0;
        int sum1 = 0;

        while (l < n) {
            sum -= nums[l];

            if (sum == sum1) {
                return l;
            }

            sum1 += nums[l];
            l++;
        }

        return -1;
    }
}
