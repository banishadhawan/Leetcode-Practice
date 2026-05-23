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
       ListNode slow=head;
       ListNode fast=head;

       while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
       }
       slow=reverse(slow);
       fast=head;

       while(slow!=null){
        if(slow.val != fast.val){
            return false;
        }
        slow=slow.next;
        fast=fast.next;
       }
       return true;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;

        while(curr!=null){
            ListNode nextn = curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextn; 
        }
        head=prev;
        return head;
    }
}

