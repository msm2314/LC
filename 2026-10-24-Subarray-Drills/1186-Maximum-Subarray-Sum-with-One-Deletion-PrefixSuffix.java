// LeetCode 1186 — Maximum Subarray Sum with One Deletion
// Prefix-suffix approach
// Time: O(n), extra space: O(n).
class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int[] p = new int[n];
        int[] s = new int[n];

        p[0] = arr[0];
        s[n - 1] = arr[n - 1];

        for (int i = 1; i < n; i++) {
            p[i] = Math.max(arr[i], arr[i] + p[i - 1]);
        }

        for (int i = n - 2; i >= 0; i--) {
            s[i] = Math.max(arr[i], arr[i] + s[i + 1]);
        }

        int ans = p[0];

        for (int nu : p) {
            ans = Math.max(nu, ans);
        }

        for (int i = 1; i < n - 1; i++) {
            ans = Math.max(ans, p[i - 1] + s[i + 1]);
        }

        return ans;
    }
}
