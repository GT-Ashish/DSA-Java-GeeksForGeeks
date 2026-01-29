
class Solution {
    public ArrayList<Integer> sumTriangles(int matrix[][]) {
        ArrayList<Integer> List = new ArrayList<>();
        int lowersum = 0;
        int uppersum = 0;
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){
                    lowersum += matrix[i][j];
                    uppersum += matrix[i][j];
                }
                else{
                if(j > i){
                    uppersum += matrix[i][j];
                }
                else{
                    lowersum += matrix[i][j];
                }
            }
            }
        }
        List.add(uppersum);
        List.add(lowersum);
        return List;
        
    }
}