package data_ADT;

public class MyStack {

	// 栈的底层我们使用数组来存储数据
	int[] elements;

	public MyStack() {
		elements = new int[0];
	}

	// 压入元素
	public void push(int element) {
		// 新建一个数组
		int[] newArr = new int[elements.length + 1];
		// 把原有数组中的元素复制到新数组中
		for (int i = 0; i < elements.length; i++) {
			newArr[i] = elements[i];
		}
		// 把元素添加到末尾
		newArr[elements.length] = element;
		// 使用新数组替换旧数组
		elements = newArr;
	}

	// 取出栈顶元素
	public int pop() {
		if (elements.length == 0) {
			throw new RuntimeException("stack is empty");
		}
		// 取出数组的最后一个元素
		int element = elements[elements.length - 1];
		// 创建一个新的数组
		int[] newArr = new int[elements.length - 1];
		// 原数组中除了最后一个元素的其他元素都放入新数组中
		for (int i = 0; i < elements.length - 1; i++) {
			newArr[i] = elements[i];
		}
		// 替换数组
		elements = newArr;
		// 返回栈顶元素
		return element;
	}

	/**
	 * 
	 * @Title: peek
	 * @Description: 查看栈顶元素
	 * @return
	 * @author author
	 * @date 2019-09-04 01:10:48
	 */
	public int peek() {
		if (elements.length == 0) {
			throw new RuntimeException("stack is empty");
		}
		return elements[elements.length - 1];
	}

	/**
	 * 
	 * @Title: isEmpty
	 * @Description: 判断是否为空
	 * @return
	 * @author author
	 * @date 2019-09-04 01:10:36
	 */
	public boolean isEmpty() {
		return elements.length == 0;
	}
}
