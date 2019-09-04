package data_ADT_Test;

import data_ADT.MyStack;

public class MyStackTest {
	public static void main(String[] args) {
		// 创建一个栈
		MyStack ms = new MyStack();
		// 压入数组
		ms.push(9);
		ms.push(8);
		ms.push(7);
		/*
		 * //取元素 System.out.println(ms.pop()); System.out.println(ms.pop());
		 * System.out.println(ms.pop());
		 */

		System.out.println(ms.peek());
		System.out.println(ms.isEmpty());
	}
}
