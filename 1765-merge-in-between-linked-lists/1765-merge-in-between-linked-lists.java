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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;
        int count = 0;

        while(count != a-1){
            temp = temp.next;
            count++;
        }
        ListNode remove = temp.next;
        temp.next = list2;
        count++;

        while(count != b){
            remove = remove.next;
            count++;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = remove.next;
        remove.next = null;
        
        return list1;
    }
}