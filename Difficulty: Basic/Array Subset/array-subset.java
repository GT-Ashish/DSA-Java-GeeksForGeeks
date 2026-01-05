
class Solution {
    public boolean isSubset(int a[], int b[]) {
        if(b.length > a.length){
            return false;
        }
        int max = Integer.MIN_VALUE;
        for(int element : b){
            max = Math.max(max , element);
        }
        int [] freqb = new int[max + 1];
        for(int element : b){
            freqb[element] += 1;
        }
        int [] freqa = new int[max + 1];
        for(int element : a){
            if(element <= max){
                freqa[element] += 1;
            }
        }
        for(int i = 0; i <= max; i++){
            if(freqb[i] > freqa[i]){
                return false;
            }
        }
        return true;
        
        
    }
    
}
