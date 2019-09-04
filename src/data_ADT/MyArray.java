package data_ADT;

import java.util.Arrays;

public class MyArray {
	private int[] elements;

	public MyArray() {
		elements = new int[0];
	}

	/**
	 * 
	 * @Title: size
	 * @Description: 获取数组长度
	 * @return
	 * @author author
	 * @date 2019-09-03 04:39:57
	 */
	public int size() {
		return elements.length;
	}

	/**
	 * 
	 * @Title: add
	 * @Description: 往数组末尾添加一个元素
	 * @param element
	 * @author author
	 * @date 2019-09-03 04:42:02
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
	 * @Title: show
	 * @Description: 打印数组
	 * @param
	 * @author author
	 * @date 2019-09-03 04:45:00
	 */
	public void show() {
		System.out.println(Arrays.toString(elements));
	}

	/**
	 * 
	 * @Title: delete
	 * @Description:删除数组中的元素
	 * @param index
	 * @author author
	 * @date 2019-09-03 04:46:02
	 */
	public void delete(int index) {
		if (index < 0 || index > elements.length - 1) {
			throw new RuntimeException("数组下标越界");
		}
		// 创建一个新数组
		int[] newArr = new int[elements.length - 1];
		// 复制原有数据到新数组
		for (int i = 0; i < newArr.length; i++) {
			if (i < index) {
				newArr[i] = elements[i];
			} else {
				newArr[i] = elements[i + 1];
			}
		}
		// 新数组替换旧数组
		elements = newArr;
	}

	/**
	 * 
	 * @Title: get
	 * @Description: 获取某个元素
	 * @param index
	 * @return
	 * @author author
	 * @date 2019-09-03 04:52:36
	 */
	public int get(int index) {
		return elements[index];
	}

	/**
	 * 
	 * @Title: insert
	 * @Description: 插入一个元素到指定位置
	 * @param index
	 * @param element
	 * @author author
	 * @date 2019-09-03 04:54:51
	 */
	public void insert(int index, int element) {
		// 创建一个新数组
		int[] newArr = new int[elements.length];
		for (int i = 0; i < elements.length; i++) {
			// 目标位置之前的元素
			if (i < index) {
				newArr[i] = elements[i];
				// 目标位置之后的元素
			} else {
				newArr[i + 1] = elements[i];
			}
		}
		// 插入新的元素
		newArr[index] = element;
		// 新数组替换旧数组
		elements = newArr;
	}

	/**
	 * 
	 * @Title: set
	 * @Description: 替换指定位置的元素
	 * @param index
	 * @param element
	 * @author author
	 * @date 2019-09-04 09:12:10
	 */
	public void set(int index, int element) {
		// 判断下标是否越界
		if (index < 0 || index > elements.length - 1) {
			throw new RuntimeException("下标越界");
		}
		elements[index] = element;
	}

	/**
	 * 
	 * @Title: search
	 * @Description: 线性查找
	 * @param target
	 * @return
	 * @author author
	 * @date 2019-09-04 10:28:34
	 */
	public int search(int target) {
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == target) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * 
	 * @Title: binarySearch
	 * @Description: 二分查找
	 * @param target
	 * @return
	 * @author author
	 * @date 2019-09-04 10:30:00
	 */
	public int binarySearch(int target) {
		int index = -1;
		int start = 0;
		int end = elements.length - 1;
		int mid = (end - start) / 2 + start;
		while (start <= end) {
			if (elements[mid] == target) {
				index = mid;
				break;
			} else if (elements[mid] > target) {
				end = mid - 1;
			} else if (elements[mid] < target) {
				start = mid + 1;
			}
			mid = (end - start) / 2 + start;
		}
		return index;
	}
	
}
