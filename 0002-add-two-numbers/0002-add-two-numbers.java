// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         if(l1.val == 0 && l2.val == 0){
//             ListNode node = new ListNode(0);
//             return node;
//         }
//         int num1 = 0;
//         int num2 = 0;
//         int pow = 0;
//         ListNode finalans = null;
//         ListNode temp = null;

//         while(l1!=null){
//           int part = l1.val*(int)(Math.pow(10,pow));
//           num1+=part; 
//           l1=l1.next;
//           pow++;
//         }

//           pow = 0;

//          while(l2!=null){
//           int part = l2.val*(int)(Math.pow(10,pow));
//           num2+=part; 
//           l2=l2.next;
//           pow++;
//         }

//         int ans = num1+num2;

//         while(ans>0){
//             int rem = ans%10;
//             ans/=10;
//             ListNode newNode = new ListNode(rem);
//             if(finalans==null){
//                 finalans = newNode;
//                 temp = newNode;
//             } 
//             else{
//                 temp.next = newNode;
//                 temp = newNode;
//             }
//         }
// return finalans;
//     }
// }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        // ListNode result = dummyHead.next;
        // dummyHead.next = null;
        return dummyHead.next;
    }
}