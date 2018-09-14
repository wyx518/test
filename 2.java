/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode a1 = new ListNode(0);
        ListNode a2 = a1;
        int flag = 0;
        while(l1!=null||l2!=null)
        {
            int b1 = l1 == null ? 0 : l1.val;
            int b2 = l2 == null ? 0 : l2.val;
            int sum = flag + b1 + b2;
            if (sum>=10)
                flag = 1 ;
            else flag=0;
            a2.next = new ListNode(sum % 10);
            a2 = a2.next;
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
        }
        
        if(flag==1)            
            a2.next = new ListNode(1);
        return a1.next;
        
    }
}