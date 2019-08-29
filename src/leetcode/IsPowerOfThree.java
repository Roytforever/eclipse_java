package leetcode;

import java.util.Scanner;

/**
 * 
 * @ClassName: IsPowerOfThree
 * @Description: 给定一个整数，写一个函数来判断它是否是 3 的幂次方。
 * @author author
 * @date 2019-08-28 07:45:51
 */
public class IsPowerOfThree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int n = input.nextInt();
			boolean result = isPowerOfThree(n);
			System.out.println(result);
		}
		input.close();
	}

	private static boolean isPowerOfThree(int n) {
		if (n < 1) {
			return false;
		}
		while (n % 3 == 0) {
			n /= 3;
		}
		return n == 1;
	}
}
