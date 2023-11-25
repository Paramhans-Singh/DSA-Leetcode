class Solution {
    public int findComplement(int num) {
        // int ans = 0;
        int temp = num;
        int mask = 0;

        if(num==0) return 1;

        while(temp!=0){
           mask = (mask<<1) | 1;
           temp = temp>>1;
        }
        // ans = ~num & mask;
        // return ans;
        return mask ^ num; 
    }
}

// as n + complement(n) = 1111
//  addition or (|)
// subtraction xor (^)