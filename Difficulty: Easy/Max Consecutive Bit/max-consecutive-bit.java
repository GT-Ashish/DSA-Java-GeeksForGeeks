class Solution {
    public int maxConsecBits(int[] arr) {
        int length = arr.length;
        int max = 0;
        int count = 0;
        int start = 0;
        for(int i = 0; i < length - 1; i++){
            if(arr[i] == arr[i + 1]){
                count ++;
                max = Math.max(max, count);
            }
            else{
                start = i;
                count = 0;
            }
        }
        return max + 1;
        
    }
}
