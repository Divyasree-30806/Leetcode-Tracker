// Last updated: 7/9/2026, 3:08:56 PM
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int row = 1; row < rows; row++) {
            for (int col = 1; col < cols; col++) {
                if (matrix[row][col] != matrix[row - 1][col - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}

