// LeetCode 167 - Two Sum II: Input Array Is Sorted
// Time: O(n), auxiliary space: O(1)
class Solution {
    public int[] twoSum(int[] num, int target) {
        int left = 0, right = num.length - 1;
        while (left < right) {
            int sum = num[left] + num[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1, -1};
    }
}
