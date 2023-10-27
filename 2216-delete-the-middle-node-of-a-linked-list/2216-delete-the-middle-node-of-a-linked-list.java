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

public int length (ListNode head){
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
public ListNode deleteMiddle(ListNode head) {
       ListNode temp = head;
       int len = length(head);
       if(len == 0) return head;
       if(len==1) return head.next;

        int part = (len/2);
     for(int i=0; i<part-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;

    return head;
    }
}