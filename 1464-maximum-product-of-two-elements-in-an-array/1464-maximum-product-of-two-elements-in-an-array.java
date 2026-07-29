class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int last = nums[len-1]-1;
        int slast = nums[len-2]-1;
        return last * slast;
    }
}