class Solution {
public:
    int findLucky(vector<int>& arr) {
        unordered_map<int, int> freq;

        // Count frequency
        for (int num : arr) {
            freq[num]++;
        }

        int maxLucky = -1;

        // Check lucky numbers
        for (auto &it : freq) {
            if (it.first == it.second) {
                maxLucky = max(maxLucky, it.first);
            }
        }

        return maxLucky;
    }
};