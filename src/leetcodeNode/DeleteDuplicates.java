package leetcodeNode;

/**
 * 
 * @ClassName: DeleteDuplicates
 * @Description: 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。

示例 1:

输入: 1->1->2
输出: 1->2
示例 2:

输入: 1->1->2->3->3
输出: 1->2->3


 * @author author
 * @date 2019-08-29 04:29:16
 */
public class DeleteDuplicates {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);
		ListNode l3 = new ListNode(2);
		ListNode l4 = new ListNode(3);
		ListNode l5 = new ListNode(3);

		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = null;

		ListNode result = deleteDuplicates(l1);
		while (result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
	}
	
	private static ListNode deleteDuplicates(ListNode head) {
		ListNode current = head;
		while (current != null && current.next != null) {
			if (current.next.val == current.val) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
		return head;
	}
}
