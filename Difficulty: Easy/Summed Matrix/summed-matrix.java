class Solution {
    static long sumMatrix(long n, long q) {
        if(q < 2 || q > n * 2){
            return 0;
        }
        return Math.min(q - 2 , n * 2 - q) + 1;
    }
}