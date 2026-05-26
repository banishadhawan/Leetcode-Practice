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
    public ListNode reverseKGroup(ListNode head, int k) {
       ListNode curr = head;

       int count=0;

       while(curr!=null && count<k){
            curr=curr.next;
            count++;
       }

        if(count<k) return head;

        curr = head;
        count=0;
        ListNode prev=null;

        while(count<k){
            ListNode nxt =curr.next;
            curr.next = prev;
            prev = curr;
            curr=nxt;
            count++;
        }
        head.next= reverseKGroup(curr,k);
        return prev;
    }
}


