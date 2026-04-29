class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) {
            return false;
        }
        
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        
        int i = 0, j = numCols-1;
        
        while(i<numRows && j>=0) {
            if(matrix[i][j]==target)
            return true;
            else if(matrix[i][j]>target)
            j--;
            else
            i++;
        }
        
        return false;
    }
}
