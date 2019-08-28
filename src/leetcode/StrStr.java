package leetcode;

import java.util.Scanner;

/**
 * 
 * @ClassName: StrStr
 * @Description: 给定一个 haystack 字符串和一个 needle 字符串， 在 haystack 字符串中找出 needle
 *               字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。 示例 1: 输入: haystack = "hello",
 *               needle = "ll" 输出: 2 示例 2: 输入: haystack = "aaaaa", needle ="bba"
 *               输出: -1
 * @author author
 * @date 2019-08-26 05:26:12
 */
public class StrStr {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String str1 = input.nextLine();
			String str2 = input.nextLine();
			int startChar = strStr(str1, str2);
			System.out.println(startChar);
		}
		input.close();
	}

	private static int strStr(String haystack, String needle) {
		int len = needle.length();
		int lenhay = haystack.length();
		if (lenhay < len) {
			return -1;
		}

		int start = 0;
		int end = len - 1;
		while (end < lenhay) {
			if (haystack.substring(start, end + 1).equals(needle)) {
				return start;
			}
			end++;
			start++;
		}
		return -1;
	}
}
