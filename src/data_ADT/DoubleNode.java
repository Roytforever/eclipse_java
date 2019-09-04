package data_ADT;

public class DoubleNode {

	// 上一个节点
	DoubleNode pre = this;
	// 下一个节点
	DoubleNode next = this;
	// 节点数据
	int data;

	public DoubleNode(int data) {
		this.data = data;
	}

	// 增加节点
	public void after(DoubleNode node) {
		// 原来的下一个节点
		DoubleNode nextNode = next;
		// 把新节点做为当前节点的下一个节点
		this.next = node;
		// 把当前节点做为新节点的上一个节点
		node.pre = this;
		// 让原来的下一个节点作为新节点的下一个节点
		node.next = nextNode;
		// 让原来的下一个节点的上一个节点为新节点
		nextNode.pre = node;
	}

	// 下一个节点
	public DoubleNode next() {
		return this.next;
	}

	// 上一个节点

	public DoubleNode pre() {
		return this.pre;
	}

	// 获取数据
	public int getData() {
		return this.data;
	}

}
