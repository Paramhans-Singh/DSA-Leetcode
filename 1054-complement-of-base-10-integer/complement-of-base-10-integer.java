class Solution {
    public int bitwiseComplement(int n) {
        int ans = 0;
        int temp = n;
        int mask = 0;

        if(n==0) return 1;

        while(temp!=0){
           mask = (mask<<1) | 1;
           temp = temp>>1;
        }
        // ans = ~n & mask;
        return mask ^ n;
    }
}