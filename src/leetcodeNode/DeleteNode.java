package leetcodeNode;

public class DeleteNode {
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

		ListNode head = l1;

		deleteNode(l4);
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}

	/**
	 * 
	 * @Title: deleteNode
	 * @Description: 从链表里删除一个节点 node 的最常见方法是修改之前节点的 next 指针，使其指向之后的节点。
	 *               因为，我们无法访问我们想要删除的节点 之前 的节点，我们始终不能修改该节点的 next 指针。相反，
	 *               我们必须将想要删除的节点的值替换为它后面节点中的值，然后删除它之后的节点。
	 * @param node
	 * @author author
	 * @date 2019-08-29 04:39:13
	 */
	private static void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
