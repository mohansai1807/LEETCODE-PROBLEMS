class Solution {
public:
    int maxArea(vector<int>& nums) {
        int start = 0;
        int end = nums.size()-1;
        int max_value = 0;
        while(start<end){
            int min_value = min(nums[start],nums[end]);
            int width = end-start;
            int current = min_value * width;
            max_value = max(current,max_value);
            if(nums[start] < nums[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return max_value;
    }
};