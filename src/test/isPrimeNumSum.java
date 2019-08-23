/**  
 * @Title: isPrimeNumSum.java
 * @Description: 求[a，b)范围内质数中十位数字之和与个位数字之和的较小值
 * @author TP
 * @date 2019-08-22 09:00:00 
 */
package test;

import java.util.Scanner;

public class isPrimeNumSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int N = input.nextInt();
			int M = input.nextInt();
			int digitsG = 0, digitsS = 0;
			for (int i = N; i < M; i++) {
				if (isPrime(i)) {
					int temp = i;
					digitsG += temp % 10;
					temp /= 10;
					digitsS += temp % 10;
				}
			}
			System.out.println(Math.min(digitsS, digitsG));
		}
		input.close();
	}

	private static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		} else {
			for (int i = 2; i < Math.sqrt(num); i++) {
				if (num % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
