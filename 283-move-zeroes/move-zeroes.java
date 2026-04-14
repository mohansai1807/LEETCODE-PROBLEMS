class Solution {
    public void moveZeroes(int[] nums) {    
        int i = 0;
        int j = 0;
        int n = nums.length;

        while(i < n && j < n){
            if(nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
    }
}

// optimal 
// class Solution {
//     public void moveZeroes(int[] nums) {
//         int i = 0;

//         for(int j = 0; j < nums.length; j++){
//             if(nums[j] != 0){
//                 int temp = nums[i];
//                 nums[i] = nums[j];
//                 nums[j] = temp;
//                 i++;
//             }
//         }
//     }
// }