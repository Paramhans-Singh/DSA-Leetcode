class Solution { 
    public boolean checkPowersOfThree(int n) {
        if(n==0) return true;
    
        int x = n % 3;
//this will give the digit at that particular place in ternary representation
// if ternary is 2 then it shows repetition of power of 3 at that place 
        if(x==2) return false;

        return checkPowersOfThree(n/3);
    }
}