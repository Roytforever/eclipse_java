package data_ADT;

public class MyQueue {
	int[] elements;

	public MyQueue() {
		elements = new int[0];
	}

	/**
	 * 
	 * @Title: add
	 * @Description: 入队
	 * @param element
	 * @author author
	 * @date 2019-09-04 02:25:32
	 */
	public void add(int element) {
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

	/**
	 * 
	 * @Title: poll
	 * @Description: 出队
	 * @return
	 * @author author
	 * @date 2019-09-04 02:25:24
	 */
	public int poll() {
		// 把数组中第0个元素取出来
		int element = elements[0];
		// 新建一个数组
		int[] newArr = new int[elements.length - 1];
		// 把原有数组中的元素复制到新数组中
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = elements[i + 1];
		}
		// 使用新数组替换旧数组
		elements = newArr;
		return element;
	}

	/**
	 * 
	 * @Title: isEmpty
	 * @Description: 判断是否为空
	 * @return
	 * @author author
	 * @date 2019-09-04 02:25:13
	 */
	public boolean isEmpty() {
		return elements.length == 0;
	}
}
