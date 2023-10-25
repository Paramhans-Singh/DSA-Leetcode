class Solution {
    public int smallestEvenMultiple(int n) {
        for(int i=n; i<Integer.MAX_VALUE; i++){
            if(i%2==0 && i%n==0) return i;
        }
        return -1;
    }
}