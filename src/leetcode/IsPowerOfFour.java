package leetcode;

import java.util.Scanner;

public class IsPowerOfFour {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int num = input.nextInt();
			boolean result = isPowerOfFour(num);
			System.out.println(result);
		}
		input.close();
	}

	private static boolean isPowerOfFour(int num) {
		if (num < 1) {
			return false;
		}

		while (num % 4 == 0) {
			num /= 4;
		}
		return num == 1;
	}
}
