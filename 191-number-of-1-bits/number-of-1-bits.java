public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
       int ans = 0;
    
     while(n!=0){
            n = n & (n-1); // this gives n-1
            ans++;

             //  if((n & 1) == 1) ans++;
             //  n = n>>>1; // n>>1 is for signed n>>>1 is for unsigned 
        }
       return ans;
    }
}

// number of 1 bit == hamming weight 