class Solution {
    public int getSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondlargest = -1;
        for(int element : arr){
            largest = Math.max(largest, element);
        }
        for(int element : arr){
            if(element != largest){
                secondlargest = Math.max(secondlargest, element);
            }
            
        }
          return secondlargest;
    }
}