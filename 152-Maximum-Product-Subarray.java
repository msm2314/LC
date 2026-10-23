class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int pd;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            pd = 1;
            for (int j = i; j < n; j++) {
                pd = pd * nums[j];
                maxi = Math.max(pd, maxi);
            }
        }
        return maxi;
    }

    /*
    for (int num : nums) {
        if (num < 0) {
            countneg++;
        }
    }
    */
}
