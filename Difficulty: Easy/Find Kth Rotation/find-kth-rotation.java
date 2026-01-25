class Solution {
    public int findKRotation(int arr[]) {
       int length = arr.length;
       int left = 0;
       int right = length - 1;
       while(left <= right){
           int mid = left + (right - left) / 2;
           if(arr[mid] >= arr[0]){
               left = mid + 1;
           }
           else{
               right = mid - 1;
           }
       }
       if(right == length - 1){
           return 0;
       }
       return right + 1;
    }
}