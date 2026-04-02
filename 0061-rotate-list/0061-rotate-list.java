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
        if(head==null || head.next==null || k==0) return head;

       ListNode tail = head;
       int l=1;

       while(tail.next!=null){
        tail=tail.next;
        l++;
       }

       tail.next = head;


        ListNode curr = head;
       k=k%l;
       for(int i=0;i<l-k-1;i++){
        curr=curr.next;
       }

       ListNode newnode = curr.next;
       curr.next = null;

       return newnode;

    }
}

