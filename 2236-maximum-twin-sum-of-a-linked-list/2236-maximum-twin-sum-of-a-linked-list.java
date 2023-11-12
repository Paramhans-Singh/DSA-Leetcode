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
    public int pairSum(ListNode head) {
        ListNode midNode = mid(head);
        ListNode midNext = midNode.next;
        midNode.next = null;
        ListNode reverse = reverse(midNext);
        int max = Integer.MIN_VALUE;

        while(head != null && reverse != null){
             int loopSum = 0;
             loopSum += head.val;
             loopSum += reverse.val;
             
             max = Math.max(max,loopSum);
             head = head.next;
             reverse = reverse.next;
        }     
        return max;
    }
    
    public ListNode mid(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next!=null && fast.next.next!=null){
          fast = fast.next.next;
          slow = slow.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head){
     if(head.next == null) return head;

     ListNode reverseTail = head.next;
     ListNode ans = reverse(head.next);
     reverseTail.next = head;

     return ans;
    }
}