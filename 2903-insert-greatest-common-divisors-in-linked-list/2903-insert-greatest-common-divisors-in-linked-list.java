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
    public int GCD(int x, int y){
        if(x>y){
         if(x%y==0) return y;
         else{
            int i = 1;
            int max = 0;
            while(i<x && i<y){
              if(x%i==0 && y%i==0) max = Math.max(max,i);
              i++;
            }
            return max;
        }
        }
        
        else if(y>=x) {
         if(y%x==0) return x;

            else{
            int i = 1;
            int max = 0;
            while(i<x && i<y){
              if(x%i==0 && y%i==0) max = Math.max(max,i);
              i++;
            }
            return max;
            }
        }      
         return 1;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        while(temp.next!= null){
            int first = temp.val;
            int second = temp.next.val;
            int gcd = GCD(first,second);

            ListNode part = temp.next;
            ListNode newNode = new ListNode(gcd);
            temp.next = newNode;
            newNode.next = part;
            temp = temp.next.next;
        }
        return head;
    }
}