class Solution {
    public int numberOfMatches(int n) {
        int team = n;
        int ans = 0;

        while(team>1){
           
           if(team%2!=0){
               ans += (team-1)/2;
               team = ((team-1)/2)+1;
           }
           
           else{
               ans+=(team/2);
               team = (team/2);
           }
        }
        return ans;
    }
}