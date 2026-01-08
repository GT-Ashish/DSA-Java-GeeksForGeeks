class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }
        int max = sum;
        int length = arr.length;
        for(int i = k; i < length; i++){
            sum += arr[i] - arr[i - k];
            max = Math.max(max, sum);
        }
        return max;
    }
}