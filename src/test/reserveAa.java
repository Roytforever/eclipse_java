package test;

import java.util.Scanner;

public class reserveAa {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String str = input.nextLine();
			char[] array = str.toCharArray();
			for (int i = 0; i < array.length; i++) {
				if (array[i] >= 'a' && array[i] <= 'z') {
					array[i] = (char) (array[i] - 32);
				} else {
					if (array[i] >= 'A' && array[i] <= 'Z') {
						array[i] = (char) (array[i] + 32);
					}
				}
			}
			String str1 = String.valueOf(array);
			System.out.println(str1);
		}
		input.close();
	}
}
