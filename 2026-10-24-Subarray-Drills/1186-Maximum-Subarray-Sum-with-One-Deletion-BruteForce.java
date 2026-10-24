// LeetCode 1186 — Maximum Subarray Sum with One Deletion
// Brute force: enumerate every subarray and try deleting each element.
// Time: O(n^3), extra space: O(1).
class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int maxSum = arr[0];

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += arr[j];
                maxSum = Math.max(maxSum, sum); // No deletion

                // Delete one element, but keep the resulting subarray non-empty.
                if (j > i) {
                    for (int k = i; k <= j; k++) {
                        maxSum = Math.max(maxSum, sum - arr[k]);
                    }
                }
            }
        }

        return maxSum;
    }
}
