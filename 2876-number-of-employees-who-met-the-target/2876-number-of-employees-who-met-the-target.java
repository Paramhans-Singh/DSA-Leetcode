class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int emp : hours){
            if(emp>=target) count++;
        }
        return count;
    }
}