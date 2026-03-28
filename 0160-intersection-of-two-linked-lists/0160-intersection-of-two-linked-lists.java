/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       Map<ListNode, Integer> map = new HashMap<>();

       ListNode A = headA;
       ListNode B = headB;

        
       while(A!=null){
            map.put(A,1);
            A = A.next;
       }

       while(B!=null){
            if(map.containsKey(B)){
                return B;
            }
            B = B.next;
       }
       return null;
       
    }
}

// public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//     if (headA == null || headB == null) return null;

//     ListNode listA = headA;
//     ListNode listB = headB;

//     while (listA != listB) {
//         listA = (listA == null) ? headB : listA.next;
//         listB = (listB == null) ? headA : listB.next;
//     }
//     return listA; // or listB
// }

