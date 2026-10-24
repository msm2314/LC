// LeetCode 1186 — Prefix/suffix maximum-subarray approach
// Time: O(n), extra space: O(n).
class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(arr[i], left[i - 1] + arr[i]);
        }

        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(arr[i], arr[i] + right[i + 1]);
        }

        int answer = left[0];
        for (int i = 0; i < n; i++) {
            answer = Math.max(answer, left[i]); // No deletion
            if (i > 0 && i < n - 1) {
                answer = Math.max(answer, left[i - 1] + right[i + 1]);
            }
        }

        return answer;
    }
}
