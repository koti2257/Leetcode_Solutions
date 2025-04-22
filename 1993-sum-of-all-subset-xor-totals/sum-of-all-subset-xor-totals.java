class Solution {
    public int subsetXORSum(int[] nums) {
        return calXOR(nums, 0, 0);
    }

    private int calXOR(int[] nums, int index, int curXOR) {
        if (index == nums.length) {
            return curXOR;
        }
        int inc = calXOR(nums, index + 1, curXOR ^ nums[index]);
        int exc = calXOR(nums, index + 1, curXOR);
        return inc + exc;
    }
}