

class Solution {
    public List<List<Integer>> findMatrix(int[] v) {
        HashMap<Integer, Integer> temp = new HashMap<>();
        for (int i : v) {
            temp.put(i, temp.getOrDefault(i, 0) + 1);
        }
        
        List<List<Integer>> ans = new ArrayList<>();

        while (!temp.isEmpty()) {

            List<Integer> curr = new ArrayList<>();
            List<Integer> toErase = new ArrayList<>();
            
            for (Map.Entry<Integer, Integer> ele : temp.entrySet()) {
                int f = ele.getKey();
                int s = ele.getValue();

                curr.add(f);
                s--;

                if (s == 0) {
                    toErase.add(f);
                }

                temp.put(f, s);
            }

            ans.add(curr);

            for (int i : toErase) {
                temp.remove(i);
            }
        }
        return ans;
    }
}

