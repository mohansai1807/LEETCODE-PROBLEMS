class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if(nums.empty()) return 0;

        set<int> s(nums.begin(), nums.end());

        int prev = INT_MIN;
        int count = 0;
        int longest = 0;

        for(int num : s) {
            if(prev != INT_MIN && num == prev + 1) {
                count++;  
            } else {
                count = 1; 
            }

            longest = max(longest, count);
            prev = num; 
        }

        return longest;
    }
};