class Solution {
    public int fib(int n) {
     if(n<=1){
         return  n;
     }   
     else{
     int prev1 = 0;
     int prev = 1;
     
     for(int i = 2 ; i<=n;i++){
         int curr = prev1+prev;
         prev1 = prev;
         prev = curr;
     }       
     return prev;       
     }
  
    }
}