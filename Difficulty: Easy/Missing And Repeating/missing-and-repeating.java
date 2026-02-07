class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
       Arrays.sort(arr);
       ArrayList<Integer> list = new ArrayList<>();
       int n = arr.length;
       int repeated = 0;
       long sum = arr[0];
       for(int i = 1; i < n; i++){
           if(arr[i] == arr[i - 1]){
               repeated = arr[i];
           }
           else{
           sum += arr[i];
           }
       }
       long actual = ((long)n * (n + 1)) / 2;
       list.add(repeated);
       list.add((int)(actual - sum));
       return list;
    }
}
