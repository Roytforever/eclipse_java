package test;

import java.util.Scanner;

/**
 * 
 * @ClassName: IsPalindromic
 * @Description: 给定一个字符串 s，找到 s 中最长的回文子串。 你可以假设 s 的最大长度为 1000。
 * @author author
 * @date 2019-08-22 02:44:34
 */
public class IsPalindromic {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String str = input.nextLine();
			// String result = longestPalindrome(str);
			String result = longestPalindrome1(str);
			System.out.println(result);
		}
		input.close();
	}

	/**
	 * 
	 * @Title: isPalindromic
	 * @Description: 判断是否为回文串
	 * @param str
	 * @return
	 * @author author
	 * @date 2019-08-22 03:25:43
	 */
	private static boolean isPalindromic(String str) {
		int len = str.length();
		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - i - 1)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 
	 * @Title: longestPalindrome
	 * @Description: 暴力求解
	 * @param str
	 * @return
	 * @author author
	 * @date 2019-08-22 03:26:02
	 */
	@SuppressWarnings("unused")
	private static String longestPalindrome(String str) {
		String ans = "";
		int max = 0;
		int len = str.length();
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j <= len; j++) {
				String test = str.substring(i, j);
				if (isPalindromic(test) && test.length() > max) {
					ans = str.substring(i, j);
					max = Math.max(max, ans.length());
				}
			}
		}
		return ans;
	}

	/**
	 * 
	 * @Title: longestPalindrome1
	 * @Description: 扩展中心
	 * @param str
	 * @return
	 * @author author
	 * @date 2019-08-22 03:59:11
	 */
	private static String longestPalindrome1(String str) {
		if (str == null || str.length() < 1) {
			throw new IllegalArgumentException("no string was we want");
		}
		int start = 0, end = 0;
		for (int i = 0; i < str.length(); i++) {
			int len1 = expandAroundCenter(str, i, i);
			int len2 = expandAroundCenter(str, i, i + 1);
			int len = Math.max(len1, len2);
			if (len > end - start) {
				start = i - (len - 1) / 2;
				end = i + len / 2;
			}
		}
		return str.substring(start, end + 1);
	}

	/**
	 * 
	 * @Title: expandAroundCenter
	 * @Description: 由于存在奇数的字符串和偶数的字符串，所以我们需要从一个字符开始扩展， 或者从两个字符之间开始扩展，所以总共有 n+n-1
	 *               个中心。
	 * @param str
	 * @param left
	 * @param right
	 * @return
	 * @author author
	 * @date 2019-08-22 04:07:49
	 */
	private static int expandAroundCenter(String str, int left, int right) {
		int L = left, R = right;
		while (L >= 0 && R < str.length() && str.charAt(L) == str.charAt(R)) {
			L--;
			R++;
		}
		return R - L - 1;
	}
}
