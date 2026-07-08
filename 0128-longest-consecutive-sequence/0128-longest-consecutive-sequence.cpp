class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if(nums.size()==0) return 0;
        sort(nums.begin(),nums.end());
        int N=nums.size();
        int lastSmaller=INT_MIN;
        int currcnt=0;
        int longest=1;
        for(int i=0;i<N;i++){
            if(nums[i]-1 == lastSmaller){
                currcnt++;
                lastSmaller=nums[i];
            }
            else if(lastSmaller!=nums[i]){
                currcnt=1;
                lastSmaller=nums[i];
            }
            longest=max(longest,currcnt);
        }
        return longest;
    }
};