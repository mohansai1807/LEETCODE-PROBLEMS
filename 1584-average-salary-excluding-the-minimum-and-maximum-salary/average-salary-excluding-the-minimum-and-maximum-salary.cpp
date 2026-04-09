class Solution {
public:
    double average(vector<int>& salary) {
        double sum = 0;
        int count = 0;
        int max = *max_element(salary.begin(),salary.end());
        int min = *min_element(salary.begin(),salary.end());
        for(auto k : salary){
            if(k==max || k ==min){
                continue;
            }
            else{
                sum = sum + k;
                count = count + 1;
            }
        }
        return sum/count;
    }
};