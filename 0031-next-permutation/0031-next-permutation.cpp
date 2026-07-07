class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int idx = -1;
        int N = nums.size();

        // Step 1: Find the first decreasing element from the right
        for (int i = N - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }

        // If no such element exists
        if (idx == -1) {
            reverse(nums.begin(), nums.end());
            return;
        }

        // Step 2: Find the next greater element
        for (int i = N - 1; i > idx; i--) {
            if (nums[i] > nums[idx]) {
                swap(nums[i], nums[idx]);
                break;
            }
        }

        // Step 3: Reverse the suffix
        reverse(nums.begin() + idx + 1, nums.end());
    }
};