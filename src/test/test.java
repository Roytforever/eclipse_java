package test;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			long n = input.nextLong();
			String str = "";
			String str1 = "";
			str = str + n;
			for (int i = 1; i < str.length(); i += 2) {
				str1 = str1 + str.charAt(i);
			}
			System.out.println(str1);
		}
		input.close();
	}
}
