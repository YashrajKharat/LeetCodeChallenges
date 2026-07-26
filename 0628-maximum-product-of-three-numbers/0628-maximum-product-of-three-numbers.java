import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        
        // Product of the 3 largest numbers (e.g., 2 * 3 * 4 = 24)
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        
        // Product of the 2 smallest numbers and the largest number (e.g., -100 * -98 * 4 = 39200)
        int product2 = nums[0] * nums[1] * nums[n - 1];
        
        // Return whichever is greater
        return Math.max(product1, product2);
    }
}
