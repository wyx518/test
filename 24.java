/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        head = dummy;
        while(head.next!=null&&head.next.next!=null)
        {
            ListNode a =head.next;
            ListNode b = head.next.next;
            head.next=b;
            a.next=b.next;
            b.next=a;
            head=a;
        }
        return dummy.next;
    }
}