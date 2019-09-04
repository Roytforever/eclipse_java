package data_ADT;

/**
 * 
 * @ClassName: Node
 * @Description: 节点类
 * @author author
 * @date 2019-09-04 02:27:59
 */
public class Node {

	// 节点内容
	int data;
	// 下一个节点
	Node next;

	public Node(int data) {
		this.data = data;
	}

	// 为节点追加节点
	public Node append(Node node) {
		// 当前节点
		Node currentNode = this;
		// 循环向后找
		while (true) {
			// 取出下一个节点
			Node nextNode = currentNode.next;
			// 如果下一个节点为null，当前节点已经是最后一个节点
			if (nextNode == null) {
				break;
			}
			// 赋值给当前节点
			currentNode = nextNode;
		}

		// 需要把追回的节点追加为找到的当前节点的下一个节点
		currentNode.next = node;
		return this;
	}

	/**
	 * 
	 * @Title: show
	 * @Description: 显示全部节点信息
	 * @author author
	 * @date 2019-09-04 03:30:22
	 */
	public void show() {
		Node currentNode = this;
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			// 取出下一个节点
			currentNode = currentNode.next;
		}
		System.out.println();
	}

	/**
	 * 
	 * @Title: removeNext
	 * @Description: 删除下一个节点
	 * @author author
	 * @date 2019-09-04 03:28:20
	 */
	public void removeNext() {
		// 取出下下一个节点
		Node newNext = next.next;
		// 把下下一个节点设置为当前节点的下一个节点
		this.next = newNext;
	}

	/**
	 * 
	 * @Title: after
	 * @Description: 插入一个节点做为当前节点的下一个节点
	 * @param node
	 * @author author
	 * @date 2019-09-04 03:34:18
	 */
	public void after(Node node) {
		// 取出下一个节点，作为下下一个节点
		Node nextNext = next;
		// 把新节点作为当前节点的下一个节点
		this.next = node;
		// 把下下一个节点设置为新节点的下一个节点
		node.next = nextNext;
	}

	// 获取下一个节点
	public Node next() {
		return this.next;
	}

	// 获取节点中的数据
	public int getData() {
		return this.data;
	}

	// 判断节点是否为最后一个节点
	public boolean isLast() {
		return next == null;
	}
}
