/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode head2 = null;
        ListNode temp = head.next;
        ListNode temp2 = null;
        int sum=0;

        while(temp!=null){
         if(temp.val == 0){
           ListNode newNode = new ListNode(sum);
           sum=0;

           if(head2==null){
             head2 = newNode;
             temp2 = head2;
           }
           else {
             temp2.next = newNode;
             temp2 = newNode;
           }
         }
         else{
           sum+=temp.val;
         }

          temp = temp.next;
        }
        return head2;
    }
}