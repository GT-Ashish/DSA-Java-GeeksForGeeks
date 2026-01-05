class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        int max = Integer.MIN_VALUE;
        for(int element : a){
            max = Math.max(element,max);
        }
        int [] freqa = new int [max + 1];
        for(int element : a){
            freqa[element] += 1;
        }
        int length = freqa.length;
        int [] freqb = new int[length];
        for(int element : b){
           if(element >= length){
               return false;
           }
           freqb[element] += 1;
        }
        for(int i = 0; i < length; i++){
            if(freqa[i] != freqb[i]){
                return false;
            }
        }
        return true;
    }
}