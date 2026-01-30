class Solution {
    public int[] FindExitPoint(int n, int m, int[][] matrix) {
        int count = 0;
        int i = 0;
        int j = 0;
        
        while(true){
            if(matrix[i][j] == 1){
                matrix[i][j] = 0;
                count ++;
                count = count % 4;
            }
            if(count == 0){
                j++;
            }
            else if(count == 1){
                i++;
            }
            else if(count == 2){
                j--;
            }
            else {
                i--;
            }
            
            if(i < 0){
                i++;
                break;
            }
            if(i == n){
                i--;
                break;
            }
            if(j < 0){
                j++;
                break;
            }
            if(j == m){
                j--;
                break;
            }
        }
        return new int[]{i,j};
    }
}    
            