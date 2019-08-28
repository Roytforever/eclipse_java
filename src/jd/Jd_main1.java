package jd;

import java.util.Scanner;

public class Jd_main1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			double n = input.nextDouble();
			int m = input.nextInt();
			double result = sumOfArray(n, m);
			System.out.printf("%.2f", result);
			System.out.println();
		}
		input.close();
	}

	/**
	 * 
	 * @Title: sumOfArray
	 * @Description: 数列的定义如下： 数列的第一项为n，以后各项为前一项的平方根，求数列的前m项的和。
	 * @param n
	 * @param m
	 * @return
	 * @author author
	 * @date 2019-08-23 10:00:31
	 */
	private static double sumOfArray(double n, int m) {
		double sum = 0.0;
		for (int i = 0; i < m; i++) {
			sum += n;
			n = Math.sqrt(n);
		}
		return sum;
	}
}
