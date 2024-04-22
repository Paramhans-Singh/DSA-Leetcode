class Solution {

    public boolean palid (String s, int n, int i){
        if(i>=n/2) return true;
        else if(s.charAt(i) != s.charAt(n-1-i)) return false;
        return palid(s,n,i+1);
    }
    public boolean isPalindrome(String s) {
       s = s.replaceAll("[^a-zA-Z0-9]","");
       s= s.toLowerCase();
      return palid(s, s.length(), 0); 
    }
}