// TC: O(n)         SC: O(1)

class Solution {
    public int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

        for (int i : nums){
            if (i > max1){
                max3 = max2;
                max2 = max1;
                max1 = i;
            } 
            
            else if (i > max2 && i < max1) {
                max3 = max2;
                max2 = i;
            } 
            
            else if (i > max3 && i < max2) {
                max3 = i;
            }
        }
        
        if (max3 != Long.MIN_VALUE){
            return (int)max3;
        } 

        return (int)max1;
    }
}