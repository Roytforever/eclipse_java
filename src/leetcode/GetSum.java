package leetcode;

import java.util.Scanner;

public class GetSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int a = input.nextInt();
			int b = input.nextInt();
			int sum = getSum(a, b);
			System.out.println(sum);
		}
		input.close();
	}

	private static int getSum(int a, int b) {
		if (b == 0) {
			return a;
		}
		int s1 = a ^ b;
		int s2 = (a & b) << 1;
		return getSum(s1, s2);
	}
}
