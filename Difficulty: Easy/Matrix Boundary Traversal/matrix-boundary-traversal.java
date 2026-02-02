class Solution {
    public ArrayList<Integer> boundaryTraversal(int mat[][]) {
        ArrayList<Integer> list = new ArrayList<>();
        int rows = mat.length;
        int cols = mat[0].length;
        for(int i = 0; i < cols; i++){
           list.add(mat[0][i]);
        }
        if(rows > 1){
            for(int i = 1; i < rows; i++){
                list.add(mat[i][rows - 1]);
            }
            for(int i = cols - 2; i >= 0; i--){
                list.add(mat[rows - 1][i]);
            }
            for(int i = rows - 2; i >= 1; i--){
                list.add(mat[i][0]);
            }
        }
        return list;
        //edge case if matrix has only one row or column 
    }
}
