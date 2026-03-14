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
    public boolean isPalindrome(ListNode head) {
       //find mid, reverse, compare
       ListNode slow=head, fast=head;
       while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
       }
       slow=reverse(slow);
       fast=head;

        while(slow!=null){
            if(fast.val != slow.val){
                return false;
            }
            slow=slow.next;
            fast=fast.next;
        }
        return true;
    }
    private ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;

        while(curr!=null){
            ListNode next=curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }
}
