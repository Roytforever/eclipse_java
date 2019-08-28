package jd;

import java.util.Scanner;

public class Jd_main2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		while (input.hasNext()) {
			int m = input.nextInt();
			int n = input.nextInt();
			for (int i = m; i <= n; i++) {
				if (flowerNum(i)) {
					count++;
					System.out.print(i + " ");
				}
			}
			if (count == 0) {
				System.out.println("no");
			}
		}
		input.close();
	}

	public static boolean flowerNum(int number) {
		int n = 0;
		int temp = number;
		while (temp != 0) {
			n += (int) Math.pow(temp % 10, 3);
			temp /= 10;
		}
		return n == number ? true : false;
	}
}
