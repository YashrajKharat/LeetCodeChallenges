#include <vector>
#include <algorithm> // Required for std::reverse

class Solution {
public:
    void rotate(std::vector<int>& nums, int k) {
        int n = nums.size();
        
        // Handle cases where k is greater than the vector size
        k = k % n; 
        
        // Step 1: Reverse the first part (0 to n-k-1)
        std::reverse(nums.begin(), nums.begin() + (n - k));
        
        // Step 2: Reverse the second part (n-k to n-1)
        std::reverse(nums.begin() + (n - k), nums.end());
        
        // Step 3: Reverse the entire vector
        std::reverse(nums.begin(), nums.end());
    }
};
