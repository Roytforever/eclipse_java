package data_ADT_Test;

public class BinarySearch {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 3, 4, 5, 6, 8, 9, 10, 12, 13, 15 };

		int index = binarySearch(array, 4);
		System.out.println(index);
	}

	public static int binarySearch(int[] array, int target) {
		int start = 0;
		int end = array.length - 1;
		int index = -1;
		int mid = (end - start) / 2 + start;
		while (start <= end) {
			if (array[mid] > target) {
				end = mid - 1;
			} else if (array[mid] < target) {
				start = mid + 1;
			} else {
				index = mid;
				break;
			}
			mid = (end - start) / 2 + start;
		}
		return index;
	}
}
