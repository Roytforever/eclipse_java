package leetcode;

/**
 * 
 * @ClassName: RemoveDuplicates
 * @Description: 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次， 返回移除后数组的新长度。
 *               不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * @author author
 * @date 2019-08-23 11:37:18
 */
public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4 };
		int result = removeDuplicates(nums);
		System.out.println(result);
	}

	/**
	 * 
	 * @Title: removeDuplicates
	 * @Description: 快慢指针
	 * @param nums
	 * @return
	 * @author author
	 * @date 2019-08-23 01:42:29
	 */
	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int j = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[j]) {
				j++;
				nums[j] = nums[i];
			}
		}
		return j + 1;
	}
}
