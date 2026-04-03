#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int trap(vector<int>& height) {
        int n = height.size();

        vector<int> left_part(n,0);
        vector<int> right_part(n,0);

        left_part[0] = height[0];
        right_part[n-1] = height[n-1];
        
        for(int i=1;i<n;i++){
            left_part[i] = max(left_part[i-1],height[i]);
        }
        for(int i=n-2;i>=0;i--){
            right_part[i] = max(right_part[i+1],height[i]);
        }

        int ans = 0;
        for(int i=0;i<n;i++){
            ans+= min(left_part[i],right_part[i])-height[i];
        }
        return ans;
    }
};