class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftsum = 0;
        for (int ele : nums)
            totalSum += ele;

        for (int i = 0; i < nums.length; i++){
            if (leftsum * 2 == totalSum - nums[i])
                return i;  

        leftsum += nums[i];     
        }
        return -1; 
    }
}