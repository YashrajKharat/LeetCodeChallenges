class Solution {
public:
    int majorityElement(vector<int>& nums) {
        // for(int i=0;i<nums.size();i++){
        //     int cnt=0;
        //     for(int j=0;j<nums.size();j++){
        //         if(nums[j]==nums[i]){
        //             cnt++;
        //         }
        //     }
        //     if(cnt>nums.size()/2){
        //         return nums[i];
        //     }
        // }

        map<int,int> mpp;
        for(int i=0;i<nums.size();i++){
            mpp[nums[i]]++;
        }
        for(auto it:mpp){
            if(it.second>nums.size()/2){
                return it.first;
            }
        }
        return{};
    }
};