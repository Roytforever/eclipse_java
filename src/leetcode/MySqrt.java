package leetcode;

import java.util.Scanner;

/**
 * 
 * @ClassName: MySqrt
 * @Description: 实现 int sqrt(int x) 函数。 计算并返回 x 的平方根，其中 x 是非负整数。
 *               由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 * @author author
 * @date 2019-08-28 05:10:48
 */
public class MySqrt {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int x = input.nextInt();
			int mySqrt = mySqrt(x);
			System.out.println(mySqrt);
		}
		input.close();
	}

	/**
	 * 
	 * @Title: 牛顿法求解平方根
	 * @Description: TODO(描述)
	 * @param x
	 * @return
	 * @author author
	 * @date 2019-08-28 05:16:01
	 */
	private static int mySqrt(int x) {
		if (x == 0) {
			return 0;
		}

		long val = x;
		while (val * val > x) {
			val = (val + x / val) / 2; // 牛顿法求解平方根的通项公式
		}
		return (int) val;
	}

	/**
	 * 
	 * @Title: 二分法求解平方根
	 * @Description: TODO(描述)
	 * @param x
	 * @return
	 * @author author
	 * @date 2019-08-28 05:21:34
	 */
	@SuppressWarnings("unused")
	private static int mySqrt1(int x) {
		if (x == 0) {
			return 0;
		}
		
		// 注意：针对特殊测试用例，例如 2147395599
        // 要把搜索的范围设置成长整型
        // 为了照顾到 0 把左边界设置为 0
		long left = 0;
		long right = x / 2 + 1;
		while (left < right) {
			 // 注意：这里一定取右中位数，如果取左中位数，代码会进入死循环
			// long mid = (right - left + 1) / 2 + left;
			long mid = (left + right + 1) >>> 1;
			long sqrt = mid * mid;
			if (sqrt > x) {
				right = mid - 1;
			} else {
				left = mid;
			}
		}
		return (int) left;
	}
}
