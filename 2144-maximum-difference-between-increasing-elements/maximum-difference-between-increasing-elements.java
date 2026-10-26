class Solution {
    public int maximumDifference(int[] nums) {
        int max_diff = -1;
        int ans = nums[0];
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(ans < nums[i]){
                int temp = nums[i] - ans;
                max_diff = Math.max(temp,max_diff);
            }
            ans = Math.min(ans,nums[i]);
        }
        return max_diff;
    }
}