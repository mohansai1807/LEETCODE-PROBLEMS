class Solution {
    public int numIdenticalPairs(int[] nums) {
        // HashMap<Integer, Integer> hash = new HashMap<>();
        // int n = nums.length;
        // for(int i=0;i<n;i++){
        //     int key = nums[i];
        //     hash.put(key,hash.getOrDefault(key,0)+1);
        // }
        // int count = 0;
        // for(int i : hash.values()){
        //     int freq = i * (i-1)/2;
        //     count += freq;
        // }
        // return count;

        int n = nums.length;
        int final_count = 0;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=i+1;j<n;j++){
                if(nums[i] == nums[j] && i<j){
                    count += 1;
                }
            }
            final_count += count;
        }
        return final_count;
    }
}