class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, target, new ArrayList<>(),0,ans);
        return ans;
    }

    private void helper(int[] candidates, int target, List<Integer> ds, int ind, List<List<Integer>> ans) {
            if(target==0){
                ans.add(new ArrayList<>(ds));
                return;
            }
            
        for(int i=ind;i<candidates.length;i++){
            if(i>ind && candidates[i]==candidates[i-1])continue;
            if(candidates[i]>target)break;

              ds.add(candidates[i]);
              helper(candidates, target-candidates[i], ds, i+1, ans);
              ds.remove(ds.size()-1);
            
            }
    }
}