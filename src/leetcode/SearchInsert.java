package leetcode;

import java.util.Scanner;

/**
 * 
 * @ClassName: SearchInsert
 * @Description: 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *               你可以假设数组中无重复元素。 示例 1: 输入: [1,3,5,6], 5 输出: 2
 * 
 *               示例 2: 输入: [1,3,5,6], 2 输出: 1
 * 
 *               示例 3: 输入: [1,3,5,6], 7 输出: 4
 * 
 *               示例 4: 输入: [1,3,5,6], 0 输出: 0
 * @author author
 * @date 2019-08-28 10:42:33
 */
public class SearchInsert {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = { 1, 3, 5, 6 };
		while (input.hasNext()) {
			int target = input.nextInt();
			int insert = searchInsert(nums, target);
			System.out.println(insert);
		}
		input.close();
	}

	private static int searchInsert(int[] nums, int target) {
		int len = nums.length;
		if (nums[len - 1] < target) {
			return len;
		}

		int start = 0;
		int end = len - 1;
		int mid = (end - start) / 2 + start;
		while (start <= end) {
			if (nums[mid] > target) {
				end = mid - 1;
			} else if (nums[mid] < target) {
				start = mid + 1;
			} else {
				return mid;
			}
			mid = (end - start) / 2 + start;
		}
		return start;
	}
}
