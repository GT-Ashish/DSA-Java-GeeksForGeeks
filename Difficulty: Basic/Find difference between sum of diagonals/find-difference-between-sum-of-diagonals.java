// User function Template for Java

class Solution {
    int diagonalSumDifference(int n, int[][] grid) {
        int left = 0;
        int right = n - 1;
        int sum1 = 0;
        int sum2 = 0; 
        for(int i = 0 ; i < n; i++){
         sum1 += grid[i][left];
         sum2 += grid[i][right];
         left ++;
         right --;
        }
        return Math.abs(sum1 - sum2);
        
    }
}