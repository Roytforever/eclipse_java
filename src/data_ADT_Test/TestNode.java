package data_ADT_Test;

import data_ADT.Node;

public class TestNode {
	public static void main(String[] args) {
		// 创建节点
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);

		n1.append(n2).append(n3).append(new Node(4));

//		// 取出下一个节点
//		System.out.println(n1.next().next().getData());
//		//判断是否为最后一个节点
//		System.out.println(n1.next().next().isLast());

		// 显示全部节点信息
		n1.show();
		/*
		 * //删除一个节点 n1.next().removeNext(); n1.show();
		 */

		// 插入一个新的节点
		Node node = new Node(5);
		n1.next().after(node);
		n1.show();
	}
}
