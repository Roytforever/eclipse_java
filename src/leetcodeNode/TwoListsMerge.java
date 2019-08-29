package leetcodeNode;

/**
 * 
 * @ClassName: TwoListsMerge
 * @Description: 将两个有序链表合并为一个新的有序链表并返回。
 * 新链表是通过拼接给定的两个链表的所有节点组成的。 
 * @author author
 * @date 2019-08-23 11:19:50
 */
public class TwoListsMerge {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(3);
		ListNode l3 = new ListNode(4);
		ListNode m1 = new ListNode(2);
		ListNode m2 = new ListNode(5);
		ListNode m3 = new ListNode(6);

		l1.next = l2;
		l2.next = l3;
		l3.next = null;
		m1.next = m2;
		m2.next = m3;
		m3.next = null;

		ListNode result = mergeTwoLists(l1, m1);
		while (result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}

		if (l1.val < l2.val) {
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
	}
}
