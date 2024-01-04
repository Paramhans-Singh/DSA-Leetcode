class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        for(int ele : nums){
            ans.put(ele,ans.getOrDefault(ele,0)+1);
        } 

        int count = 0;
        boolean flag = true;

        for(Map.Entry<Integer,Integer> entry : ans.entrySet()){
            int temp = entry.getValue();

            if (temp == 1) return -1;
          
            count += temp / 3; 
            if (temp % 3 != 0) count++;
        }
        return count;
    }
}