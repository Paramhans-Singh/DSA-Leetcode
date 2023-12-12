//  maximum product jab bhi aye tab max1 max2 vala hi method use hoga 


class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0; // greatest
        int max2 = 0; // second greatest
        for(int i:nums){
            if(i>max1){
                max2 = max1;
                max1 = i;
            }
            else if(i>max2){
                max2 = i;
            }
        }
        return (max1-1)*(max2-1);
    }
}


// or

// import java.util.*;

// class Solution {
//     public int maxProduct(int[] nums) {
//         PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
//         for(int i=0;i<nums.length;i++){
//             heap.add(nums[i]);
//         }

//         int n1 = (heap.remove())-1;
//         int n2 = (heap.remove())-1;
//         int max = n1*n2;
//         return max;

//     }
// }