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
        Map<ListNode,Integer> map = new HashMap<>();

      ListNode list1 = headA;
      ListNode list2 = headB;

        while(list1!=null){
            map.put(list1,1);
            list1=list1.next;
        }

        while(list2!=null){
            if(map.containsKey(list2))
            return list2;

            list2=list2.next;
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

