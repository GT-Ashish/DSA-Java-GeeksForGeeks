// User function Template for Java

class Solution {
    public void Addition(int[][] matrixA, int[][] matrixB) {
        int length = matrixA.length;
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                matrixA[i][j] += matrixB[i][j];
            }
        }
        
    }
}