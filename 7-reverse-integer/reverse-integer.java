class Solution {
    public int reverse(int x) {
        int ans = 0;
        while(x!=0){ // as x can be -ve also 
        int rem = x%10;  
        if(ans > Integer.MAX_VALUE/10 || ans<Integer.MIN_VALUE/10)return 0;
            ans = ans *10 + rem; 
// inorder to multiply by 10 we have to check first in the above if by max and min values
            x= x/10;
        }
       
        return ans;
    }
}