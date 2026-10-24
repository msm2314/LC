// LeetCode 1186 — Two-array DP
// noDelete[i]: best non-empty subarray ending at i without deletion.
// oneDelete[i]: best subarray ending at i after exactly one deletion.
// Time: O(n), extra space: O(n).
class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int[] noDelete = new int[n];
        int[] oneDelete = new int[n];

        noDelete[0] = arr[0];
        oneDelete[0] = Integer.MIN_VALUE / 2; // No deletion used yet is invalid for this state.
        int answer = arr[0];

        for (int i = 1; i < n; i++) {
            noDelete[i] = Math.max(arr[i], noDelete[i - 1] + arr[i]);
            oneDelete[i] = Math.max(noDelete[i - 1], oneDelete[i - 1] + arr[i]);

            answer = Math.max(answer, noDelete[i]);
            answer = Math.max(answer, oneDelete[i]);
        }

        return answer;
    }
}
