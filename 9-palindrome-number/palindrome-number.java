class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int reverse = 0;
        while(temp>0){
            int rem = temp%10;
            reverse = reverse*10 + rem;
            temp/=10;
        }
        return (reverse==x);
    }
}