class Solution {

    public boolean isPalid(String s, int i ,int n){
        if(i>=n/2) return true;
        if (s.charAt(i)!=s.charAt(n-1-i))return false;
        return isPalid(s,i+1,n);

    }
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();

        int n = s.length();
        boolean ans = isPalid(s, 0, n);
        return ans;
    }
}