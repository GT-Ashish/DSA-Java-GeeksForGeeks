class Solution {
    public void MakeZeros(int[][] matrix) {
       int m = matrix.length;
       int n = matrix[0].length;
       int [][] answer = new int [m][n];
       for(int i = 0; i < m; i++){
           for(int j = 0; j < n; j++){
                answer[i][j] = matrix[i][j];
           }
       }
       for(int i = 0; i < m; i++){
           for(int j = 0; j < n; j++){
               if(answer[i][j] == 0){
                   int sum = 0;
                   if(i - 1 >= 0){
                       matrix[i-1][j] = 0;
                       sum += answer[i-1][j];
                   }
                   if(i + 1 < m){
                       matrix[i+1][j] = 0;
                       sum += answer[i+1][j];
                   }
                   if(j - 1 >= 0){
                       matrix[i][j-1] = 0;
                       sum += answer[i][j-1];
                   }
                   if(j + 1 < n){
                       matrix[i][j+1] = 0;
                       sum += answer[i][j+1];
                   }
                   matrix[i][j] = sum;
               }
           }
           
       }
       
        
    }
}