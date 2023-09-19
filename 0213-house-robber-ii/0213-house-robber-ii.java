class Solution {
    public static int SumOptimal(int nums[]) {
        int n = nums.length;
        int prev = nums[0];
        int prev2 = 0;

        for (int i = 1; i < n; i++) {
            int pick = nums[i] + prev2;
            int notpick = 0 + prev;

            int curr = Math.max(pick, notpick);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }

    public int rob(int[] nums) {
        int n = nums.length;

        if(n==1){
            return nums[0];
        }

         int nums1[] = new int[n-1];
         int nums2[] = new int[n-1];

         for(int i=0;i<n;i++){
             if(i!=0)nums1[i-1]=nums[i];
             if(i!=n-1)nums2[i]=nums[i];
         }
     

     return Math.max(SumOptimal(nums1),SumOptimal(nums2));
    }
}