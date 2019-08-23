package test;

/**
 * 
 * @ClassName: FindMedian
 * @Description: 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 *               请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 *               你可以假设 nums1 和 nums2 不会同时为空。
 * @author TP
 * @date 2019-08-22 11:08:24
 */
public class FindMedian {
	public static void main(String[] args) {
		int[] arrA = { 1, 2, 3, 4, 5, 6 };
		int[] arrB = { 7, 8, 9, 10, 11 };
		double mindNumber = findMedianSortedArrays1(arrA, arrB);
		System.out.println(mindNumber);

	}

	/**
	 * 
	 * @Title: findMedianSortedArrays1
	 * @Description: 先将两个数组合并，两个有序数组的合并也是归并排序中的一部分。然后根据奇数，还是偶数，返回中位数。
	 * @param A
	 * @param B
	 * @return
	 * @author TP
	 * @date 2019-08-22 12:12:11
	 */
	private static double findMedianSortedArrays1(int[] A, int[] B) {
		int m = A.length;
		int n = B.length;
		int[] nums = new int[m + n];
		if (m == 0) {
			if (n % 2 == 0) {
				return (B[n / 2] + B[n / 2 - 1]) / 2.0;
			} else {
				return B[n / 2];
			}
		}
		if (n == 0) {
			if (m % 2 == 0) {
				return (A[m / 2] + A[m/ 2 - 1]) / 2.0;
			} else {
				return A[m/ 2];
			}
		}
		int count = 0;
		int i = 0, j = 0;
		while (count != (m + n)) {
			if (i == m) {
				while (j != n) {
					nums[count++] = B[j++];
				}
				break;
			}
			if (j == n) {
				while (i != m) {
					nums[count++] = A[i++];
				}
				break;
			}
			if (A[i] < B[j]) {
				nums[count++] = A[i++];
			} else {
				nums[count++] = B[j++];
			}
		}
		if (count % 2 == 0) {
			return (nums[count / 2] + nums[count / 2 - 1]) / 2.0;
		} else {
			return nums[count / 2];
		}
	}

	/**
	 * 
	 * @Title: findMedianSortedArrays2
	 * @Description: 开始的思路是写一个循环，然后里边判断是否到了中位数的位置，到了就返回结果，但这里对偶数和奇数的分类会很麻烦。
	 *               当其中一个数组遍历完后，出了 for
	 *               循环对边界的判断也会分几种情况。总体来说，虽然复杂度不影响，但代码会看起来很乱。首先是怎么将奇数和偶数的情况合并一下。 用
	 *               len 表示合并后数组的长度，如果是奇数，我们需要知道第 （len+1）/2 个数就可以了，如果遍历的话需要遍历
	 *               int(len/2 ) + 1 次。 如果是偶数，我们需要知道第 len/2和 len/2+1 个数，也是需要遍历
	 *               len/2+1 次。所以遍历的话，奇数和偶数都是 len/2+1 次。
	 *               返回中位数的话，奇数需要最后一次遍历的结果就可以了，偶数需要最后一次和上一次遍历的结果。所以我们用两个变量 left 和
	 *               right， right 保存当前循环的结果，在每次循环前将 right 的值赋给
	 *               left。这样在最后一次循环的时候，left 将得到 right 的值， 也就是上一次循环的结果，接下来 right
	 *               更新为最后一次的结果。循环中该怎么写，什么时候 A 数组后移，什么时候 B 数组后移。用 aStart 和 bStart
	 *               分别表示当前指向 A 数组和 B 数组的位置。 如果 aStart 还没有到最后并且此时 A 位置的数字小于 B
	 *               位置的数组，那么就可以后移了。也就是aStart＜m&&A[aStart]< B[bStart]。 但如果 B
	 *               数组此刻已经没有数字了，继续取数字 B[ bStart ]，则会越界，所以判断下 bStart 是否大于数组长度了，这样 ||
	 *               后边的就不会执行了， 也就不会导致错误了，所以增加为 aStart＜m&&(bStart)>=
	 *               n||A[aStart]<B[bStart])。
	 * @param A
	 * @param B
	 * @return
	 * @author author
	 * @date 2019-08-22 02:02:19
	 */
	@SuppressWarnings("unused")
	private static double findMedianSortedArrays2(int[] A, int[] B) {
		int m = A.length;
		int n = B.length;
		int len = m + n;
		int left = -1, right = -1;
		int aStart = 0, bStart = 0;
		for (int i = 0; i <= len / 2; i++) {
			left = right;
			if (aStart < m && (bStart >= n || A[aStart] < B[bStart])) {
				right = A[aStart++];
			} else {
				right = B[bStart++];
			}
		}
		if (len % 2 == 0) {
			return (left + right) / 2.0;
		} else {
			return right;
		}
	}

	@SuppressWarnings("unused")
	private static double findMedianSortedArrays3(int[] A, int[] B) {
		int n = A.length;
		int m = B.length;
		int left = (m + n + 1) / 2;
		int right = (m + n + 2) / 2;
		// 将偶数和奇数的情况合并，如果是奇数，会求两次同样的 k 。
		return (getKth(A, 0, n - 1, B, 0, m - 1, left) + getKth(A, 0, n - 1, B, 0, m - 1, right)) * 0.5;
	}

	private static int getKth(int[] A, int start1, int end1, int[] B, int start2, int end2, int k) {
		int len1 = end1 - start1 + 1;
		int len2 = end2 - start2 + 1;
		// 让 len1 的长度小于 len2，这样就能保证如果有数组空了，一定是 len1
		if (len1 > len2) {
			return getKth(B, start2, end2, A, start1, end1, k);
		}

		if (len1 == 0) {
			return B[start2 + k - 1];
		}

		if (k == 1) {
			return Math.min(A[start1], B[start2]);
		}

		int i = start1 + Math.min(len1, k / 2) - 1;
		int j = start2 + Math.min(len2, k / 2) - 1;

		if (A[i] > B[j]) {
			return getKth(A, start1, end1, B, j + 1, end2, k - (j - start2 + 1));
		} else {
			return getKth(A, i + 1, end1, B, start2, end2, k - (i - start1 + 1));
		}
	}

}
