class Solution {
    public int removeDuplicates(int[] nums) {
        // int j = 1;
        // for (int i = 1; i < nums.length; i++) {
        //     if (nums[i] != nums[i - 1]) {
        //         nums[j] = nums[i];
        //         j++;
        //     }
        // }
        // return j;
        int i =1, j=1;
        while(i<nums.length){
              if(nums[i]==nums[i-1]) i++;
              else {
                nums[j] = nums[i];
                j++;
                i++;
              }
        }
        // if(nums[i] != nums[i-1]) return j+1;
         return j;
    }
}