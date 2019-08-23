package test;

import java.util.Scanner;

/**
 * 
 * @ClassName: IntReverse
 * @Description: 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。如果结果溢出返回0
 * @author author
 * @date 2019-08-22 04:30:05
 */
public class IntReverse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int num = input.nextInt();
			int result = reverse(num);
			System.out.println(result);
		}
		input.close();
	}

	private static int reverse(int x) {
		long y = 0;
		while (x != 0) {
			y = y * 10 + x % 10;
			x /= 10;
		}
		if (y > Integer.MAX_VALUE || y < Integer.MIN_VALUE)
			return 0;
		return (int) y;
	}

	@SuppressWarnings("unused")
	private static int reverse1(int x) {
		int rev = 0;
		while (x != 0) {
			int pop = x % 10;
			x /= 10;
			if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
				return 0;
			if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))
				return 0;
			rev = rev * 10 + pop;
		}
		return rev;
	}
}
