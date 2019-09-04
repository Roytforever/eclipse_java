package leetcodeNode;

public class ReverseList {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);

		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = null;

		ListNode result = reverseList(l1);
		while (result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}

	}

	private static ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		while (curr != null) {
			ListNode listTemp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = listTemp;
		}
		return prev;
	}
}
