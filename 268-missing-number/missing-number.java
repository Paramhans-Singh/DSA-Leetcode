class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int part = 0;
        int part1 = 0;
        for(int i=1; i<=n; i++) part^=i;
        for(int i=0; i<n; i++) part1^=nums[i];

        return part^part1;
    }
}