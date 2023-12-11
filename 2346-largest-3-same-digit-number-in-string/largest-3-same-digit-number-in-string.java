class Solution {
    public String largestGoodInteger(String num) {
        String ans = "";
        String temp = "";
        int max = Integer.MIN_VALUE;

        for(int i=1; i<num.length()-1; i++){
        if(num.charAt(i)==num.charAt(i-1) && num.charAt(i)==num.charAt(i+1)){
          temp = num.substring(i-1,i+2);
          int t1 = Integer.parseInt(temp);
          max = Math.max(max, t1);
        }
        }
        if(max == Integer.MIN_VALUE) return "";
        else if(max==0) return "000";
        else{
        ans = Integer.toString(max);
        return ans;
        }
    }
}