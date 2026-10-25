class Solution {
    public int kConcatenationMaxSum(int[] ar, int k) {
        int n = ar.length;
        long sum = 0;
        long total = 0;
        int n1 = n * Math.min(k, 2);
        long maxi = 0;
        long mod = 1000000007;

        for (int j = 0; j < n1; j++) {
            sum += ar[j % n];
            maxi = Math.max(maxi, sum);

            if (sum < 0) {
                sum = 0;
            }
        }

        for (int nums : ar) {
            total += nums;
        }

        if (total > 0 && k > 2) {
            maxi += (long) (k - 2) * total;
        }

        return (int) (maxi % mod);
    }
}
