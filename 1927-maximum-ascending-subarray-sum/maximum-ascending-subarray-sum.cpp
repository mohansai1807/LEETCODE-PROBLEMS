class Solution {
public:
    int maxAscendingSum(vector<int>& nums) {
        int maximum = 0;
        int n = nums.size();
        for(int i=0;i<n;i++){
            int sum = nums[i];
            maximum = max(sum,maximum);

            for(int j=i+1;j<n;j++){
                if(nums[j] > nums[j-1]){
                    sum = sum + nums[j];
                    maximum = max(sum,maximum);
                }
                else{
                    break;
                }
            }

            
        }
        return maximum;
    }
};