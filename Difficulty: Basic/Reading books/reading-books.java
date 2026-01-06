class Solution {
    public int maxPoint(int k, int[] arr1, int[] arr2) {
        int length = arr1.length;
        int max = 0;
        for(int i = 0; i < length; i++){
            max = Math.max(max, k / arr1[i] * arr2[i]);
            
        }
        return max;
        
    }
}
