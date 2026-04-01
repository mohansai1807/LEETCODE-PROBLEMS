class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
        vector<vector<int>>res;
        int n = matrix.size();
        for(int i=0;i<n;i++){
            vector<int>a;
            for(int j=n-1;j>=0;j--){
                a.push_back(matrix[j][i]);
            }
            res.push_back(a);
        }
        for(int k=0;k<n;k++){
            for(int it=0;it<n;it++){
                matrix[k][it] = res[k][it];
            }
        }
        
    }
};