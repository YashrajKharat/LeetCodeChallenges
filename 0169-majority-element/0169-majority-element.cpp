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

        // map<int,int> mpp;
        // for(int i=0;i<nums.size();i++){
        //     mpp[nums[i]]++;
        // }
        // for(auto it:mpp){
        //     if(it.second>nums.size()/2){
        //         return it.first;
        //     }
        // }


        int cnt=0;
        int cnt1=0;
        int el;
        int n=nums.size();
        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt=1;
                el=nums[i];
            }
            else if(nums[i]==el){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==el){
                cnt1++;
            }
        }
        if(cnt1>n/2){
            return el;
        }
        return{};
    }
};