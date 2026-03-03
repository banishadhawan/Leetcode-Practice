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
    public ListNode partition(ListNode head, int x) {
         ListNode left_h = new ListNode(0);
        ListNode right_h = new ListNode(0);

        ListNode left = left_h, right = right_h;

        while(head!=null){
            if(head.val < x){
                left.next = head;
                left=left.next;
            }
            else{
                right.next=head;
                right=right.next;
            }
            head=head.next;
        }
        right.next=null;
        left.next = right_h.next;

        return left_h.next;
    }
}