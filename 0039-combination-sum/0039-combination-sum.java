class Solution {
    public void helper(int[] arr, int sum, List<Integer> ds, int ind, List<List<Integer>> ans) {
        if (ind == arr.length) {
            if (sum==0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
         
        if(arr[ind]<=sum){
            ds.add(arr[ind]);
            helper(arr, sum-arr[ind], ds, ind,ans);
            ds.remove(ds.size()-1);
        }
        helper(arr, sum, ds, ind + 1,ans);

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(candidates, target, new ArrayList<>(),0,ans);
        return ans;
    }
}