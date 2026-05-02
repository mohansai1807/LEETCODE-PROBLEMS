class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // for(int i=0;i<matrix.length;i++){
        //     int[] array = matrix[i];
        //     for(int j : array){
        //         if(j==target){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        int row = 0;
        int col = matrix[0].length -1;

        while(row< matrix.length && col>=0){
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col]  > target){
                col--;
            }
            else{
                row++;
            }
        }

        return false;
    }
}