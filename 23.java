/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
		if (lists == null || lists.length == 0)
			return null;
		// PriorityQueue 是堆，默认小顶堆 优先队列是关键
		PriorityQueue<ListNode> min = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
			@Override
			public int compare(ListNode o1, ListNode o2) {
				return o1.val - o2.val;
			}
		});
		// 加入所有链表的第一个结点，非空
		for (ListNode node : lists)
        {
            //System.out.println(node.val);
            if (node != null)
				min.offer(node);
        }
		ListNode head = new ListNode(0);
		ListNode cur = head;
		while (!min.isEmpty()) {
			ListNode temp = min.poll();
           // System.out.println("___");
           // System.out.println(temp.val);
			cur.next = temp;
			cur = cur.next;
			// 边取边加入
			if (temp.next != null)
				min.offer(temp.next);
           // System.out.println(temp.next.val);
		}
		// 注意断链
		cur.next = null;
		return head.next;
	}

}