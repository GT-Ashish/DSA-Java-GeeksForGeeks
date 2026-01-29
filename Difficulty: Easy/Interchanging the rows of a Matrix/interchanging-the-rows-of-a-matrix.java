class Solution {
    static void interchangeRows(int matrix[][]) {
        int top = 0;
        int bottom = matrix.length - 1;
        int length = matrix[0].length;
        while(top < bottom){
        for(int i = 0; i < length; i++){
            int temp = matrix[top][i];
            matrix[top][i] = matrix[bottom][i];
            matrix[bottom][i] = temp;
        }
        top ++;
        bottom --;
    }
        
    }
}
