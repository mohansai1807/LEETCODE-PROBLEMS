class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                else{
                    int sum = (nums[i]-1) * (nums[j]-1);
                    if(sum>max){
                        max = sum;
                    }
                }
            }
        }
        return max;
    }
}