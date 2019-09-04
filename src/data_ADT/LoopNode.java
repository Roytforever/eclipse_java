package data_ADT;

/**
 * 
 * @ClassName: Node
 * @Description: 节点类
 * @author author
 * @date 2019-09-04 02:27:59
 */
public class LoopNode {

	// 节点内容
	int data;
	// 下一个节点
	LoopNode next=this;

	public LoopNode(int data) {
		this.data = data;
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
		LoopNode newNext = next.next;
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
	public void after(LoopNode node) {
		// 取出下一个节点，作为下下一个节点
		LoopNode nextNext = next;
		// 把新节点作为当前节点的下一个节点
		this.next = node;
		// 把下下一个节点设置为新节点的下一个节点
		node.next = nextNext;
	}

	// 获取下一个节点
	public LoopNode next() {
		return this.next;
	}

	// 获取节点中的数据
	public int getData() {
		return this.data;
	}


}
