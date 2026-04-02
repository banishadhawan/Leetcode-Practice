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
    public ListNode rotateRight(ListNode head, int k) {
       if(head == null || head.next==null || k==0) return head;

        //length
       ListNode tail = head;
       int length = 1;

       while(tail.next != null){
        tail = tail.next;
        length++;
       }

        //circular
        tail.next = head;

       k = k%length;

       ListNode curr = head;
       for(int i=0;i<length-k-1;i++){
        curr = curr.next;
       }

       ListNode next = curr.next;
       curr.next = null;

       return next;
    }
}