class Solution {
    public int minSubarraySum(int[] arr) {
        int sum = 0;
        int mini = Integer.MAX_VALUE;

        for (int num : arr) {
            sum += num;
            mini = Math.min(mini, sum);
            if (sum > 0) {
                sum = 0;
            }
        }
        return mini;
    }
}
