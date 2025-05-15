class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0, maxval = Integer.MIN_VALUE;
        for (int val : nums) {
            sum += val;
            maxval = Math.max(sum, maxval);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxval;
    }
}