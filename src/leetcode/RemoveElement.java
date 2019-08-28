package leetcode;

import java.util.Scanner;
/**
 * 
 * @ClassName: RemoveElement
 * @Description: 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
					不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
					元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * @author author
 * @date 2019-08-26 05:13:40
 */
public class RemoveElement {
	public static void main(String[] args) {
		int[] nums = { 1, 3, 7, 9, 7, 6, 7, 8, 6, 6 };
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int val = input.nextInt();
			int result = removeElement(nums, val);
			System.out.println(result);
		}
		input.close();
	}

	/**
	 * 
	 * @Title: removeElement
	 * @Description: 双指针法
	 * @param nums
	 * @param val
	 * @return
	 * @author author
	 * @date 2019-08-26 05:22:01
	 */
	private static int removeElement(int[] nums, int val) {
		/*
		 * if (nums.length==0) { throw new IllegalArgumentException("NO number of value",);
		 * }
		 */

		int i =0;;

		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != val) {
				nums[i++] = nums[j];
			}
		}
		return i;
	}
}
