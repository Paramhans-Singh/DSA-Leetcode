class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int j = 0; 
        int count =0;
        Arrays.sort(g);
        Arrays.sort(s);
        for(int i=0; i<s.length && j<g.length; i++){
           if(s[i]>=g[j]){
               count++;
               j++;
           }
        }
        return count;
    }
}