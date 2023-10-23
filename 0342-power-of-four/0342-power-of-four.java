import java.util.*;
class Solution {
    public boolean isPerfectSquare(int n) {
        int x = (int) Math.sqrt(n);
        return (x * x == n);
    }
 
    public boolean isPowerOfFour(int n) {
         if (n <= 0)
            return false;
 
        if (!isPerfectSquare(n))
            return false;

        return (n & (n - 1)) == 0 ? true : false;
    }
}