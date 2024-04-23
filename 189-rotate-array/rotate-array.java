class Solution {
    public void swap(int arr[], int i, int j){
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
    }
    public void reverse(int arr[], int i, int j){
        if(i>j) return;
        swap(arr, i, j);
        reverse(arr, i+1, j-1);
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n==0) return;
        k = k%n;
        if(k>n) return;
       reverse(nums, n-k, n-1);
       reverse(nums, 0, n-k-1);
       reverse(nums, 0, n-1);
    }
}