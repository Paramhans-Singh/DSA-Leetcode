class Solution {
    public int findSpecialInteger(int[] arr) {
        if(arr.length == 1){
            return arr[0];
        }
        
        int percent = (25*(arr.length))/100;
        int count = 1;
        int ans = 0;
        for(int i=1; i<arr.length; i++){
           if(arr[i-1] == arr[i]){
             count++;
             if(count>=percent) ans = arr[i];
           }
           else count=1;
        }

        return ans;
    }
}