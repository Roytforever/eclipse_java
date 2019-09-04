package data_ADT_Test;

import data_ADT.MyArray;

public class MyArrayTest {
	public static void main(String[] args) {
		// 创建一个可变数组
		MyArray ma = new MyArray();
		// 获取长度
		ma.size();
		ma.show();

		// 往可变数组添加元素
		ma.add(87);
		ma.add(88);
		ma.add(96);
		ma.add(99);
		ma.show();

		/*
		 * // 删除元素 ma.delete(1); ma.show();
		 */

		int index = ma.binarySearch(99);
		System.out.println(index);

	}
}
