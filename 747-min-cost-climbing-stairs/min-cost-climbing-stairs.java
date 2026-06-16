class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int a = cost[0];
        int b = cost[1];
        int curr = 0;
        for(int i=2;i<n;i++){
            curr = cost[i] + Math.min(a,b);
            a = b;
            b = curr;
        }
        int res = Math.min(a,b);
        return res;
    }
}