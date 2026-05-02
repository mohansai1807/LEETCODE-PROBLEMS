class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            int[] array = matrix[i];
            for(int j : array){
                if(j==target){
                    return true;
                }
            }
        }
        return false;
    }
}