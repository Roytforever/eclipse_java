package leetcode;

import java.util.Scanner;

/**
 * 
 * @ClassName: LengthOfLastWord
 * @Description: 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。 如果不存在最后一个单词，请返回 0 。
 *               说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 * 
 *               示例:
 * 
 *               输入: "Hello World" 输出: 5
 * 
 * @author author
 * @date 2019-08-28 02:18:28
 */
public class LengthOfLastWord {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String str = input.nextLine();
			int length = lengthOfLastWord(str);
			System.out.println(length);
		}
		input.close();
	}

	/**
	 * 
	 * @Title: 字符串遍历
	 * @Description: 从字符串末尾开始向前遍历，其中主要有两种情况 第一种情况，以字符串"HelloWorld"为例，
	 *               从后向前遍历直到遍历到头或者遇到空格为止，即为最后一个单词"World"的长度5 第二种情况，以字符串"Hello World"为例，
	 *               需要先将末尾的空格过滤掉，再进行第一种情况的操作，即认为最后一个单词为"World"，长度为5
	 *               所以完整过程为先从后过滤掉空格找到单词尾部，再从尾部向前遍历，找到单词头部，最后两者相减，即为单词的长度
	 *               时间复杂度：O(n)，n为结尾空格和结尾单词总体长度
	 * @param s
	 * @return
	 * @author author
	 * @date 2019-08-28 02:19:32
	 */
	private static int lengthOfLastWord(String s) {
		int len = s.length();
		int end = len - 1;
		while (end >= 0 && s.charAt(end) == ' ') {
			end--;
		}
		if (end < 0) {
			return 0;
		}
		int start = end;
		while (start >= 0 && s.charAt(start) != ' ') {
			start--;
		}
		return end - start;
	}
}
