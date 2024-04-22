class Solution {
    public int fib(int n) {
    //  if(n<=1){
    //      return  n;
    //  }   
    //  else{
    //  int prev1 = 0;
    //  int prev = 1;
    //  int curr = 0;
     
    //  for(int i = 2; i<=n; i++){
    //      curr = prev1+prev;
    //      prev1 = prev;
    //      prev = curr;
    //  }       
    //  return curr;       
    //  }
  
   // by using recursion 
      if(n<=1) return n;
      return fib(n-1) + fib(n-2);

    }
}