class Solution {
    public int majorityElement(int[] nums) {
       int n = nums.length;
       HashMap<Integer, Integer> hm = new HashMap<>(); 
       for(int i=0;i<n;i++){
        int value = nums[i];
        hm.put(value,hm.getOrDefault(value,0)+1);
       }
       int ans = 0;
       for(int k : hm.keySet()){
            int v = hm.get(k);
            if(v > n/2){
                ans = k;
            }
        }
        return ans;
    }
}

    //  int n = nums.length;
    //    HashMap<Integer, Integer> hm = new HashMap<>(); 
    //    for(int i=0;i<n;i++){
    //     int value = nums[i];
    //     if(hm.containsKey(value)){
    //         int prev = hm.get(value);
    //         hm.put(value,prev+1);
    //     }
    //     else{
    //         hm.put(value,1);
    //     }
    //    }

    //    for(int k : hm.keySet()){
    //         int v = hm.get(k);
    //         if(v > n/2){
    //             return k;
    //         }
    //     }
    //     return -1;