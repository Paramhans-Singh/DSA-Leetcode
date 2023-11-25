class Solution {
    public int subtractProductAndSum(int n) {
        int ans = 1;
        int sum = 0;
        while(n!=0){
            int rem = n%10;
            ans *= rem;
            sum+=rem;
            n/=10;
        }

        return ans-sum;
    }
}