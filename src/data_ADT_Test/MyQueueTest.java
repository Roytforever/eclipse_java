package data_ADT_Test;

import data_ADT.MyQueue;

public class MyQueueTest {
	public static void main(String[] args) {
		MyQueue mq = new MyQueue();

		// 入队
		mq.add(9);
		mq.add(8);
		mq.add(7);

		// 出队
		System.out.println(mq.poll());
		System.out.println(mq.isEmpty());
	}
}
