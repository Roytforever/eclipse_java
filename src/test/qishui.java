package test;

import java.util.Scanner;

public class qishui {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int num = input.nextInt();
			int count = countNum(num);
			System.out.println(count);
		}
		input.close();
	}

	public static int countNum(int num) {
		return num * 2 - 1;
	}
}
