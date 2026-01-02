class Solution {
    int convertfive(int num) {
       if(num == 0){
           return 5;
       }
       int newdig = 0;
       int noDig = (int)(Math.log10(num)) + 1;
       for(int i = noDig -1; i >= 0;i--){
           int power =(int)Math.pow(10,i);
           int dig = num / power;
           num = num % power;
           if(dig == 0){
               dig = 5;
           }
           newdig = newdig * 10 + dig;
       }
       return newdig;
        
    }
}