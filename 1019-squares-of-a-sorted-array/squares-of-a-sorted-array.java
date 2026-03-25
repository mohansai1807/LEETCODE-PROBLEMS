class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] arr = new int[nums.length];
        int start = 0;
        int end = nums.length-1;
        int ptr = arr.length-1;
        while(start<=end){
            int ss = nums[start] * nums[start];
            int es = nums[end] * nums[end];
            if(ss>es){
                arr[ptr] = ss;
                start++;
            }
            else{
                arr[ptr] = es;
                end--;
            }
            ptr--;
        }
        return arr;
    }
}