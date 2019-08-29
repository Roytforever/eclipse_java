package leetcode;

import java.util.Scanner;

public class ClimbStairs {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int n = input.nextInt();
			int countNum = climbStairs(n);
			System.out.println(countNum);
		}
		input.close();
	}

	private static int climbStairs(int n) {
		if (n < 3) {
			return n;
		} else {
			int[] array = new int[n + 1];
			array[1] = 1;
			array[2] = 2;
			for (int i = 3; i <= n; i++) {
				array[i] = array[i - 1] + array[i - 2];
			}
			return array[n];
		}
	}
}
