package Day22;

public class Day22 {
	public static void binarySearch(int[] arr) {

		int start = 0;
		int end = arr.length - 1;
		int target = 6;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == target) {
				System.out.println("Element found");
				break;
			} else if (arr[mid] > target) {
				start = mid + 1;
			} else {
				end = end - 1;
			}
		}
	}

	public static void linearSearchWithoutFlag(int[] arr) {
		int search = 15;
		int i = 0;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				System.out.println("Element found");
				break;
			}
		}

		if (i == arr.length) {
			System.out.println("Element Not Found");
		}
	}

	public static void main(String[] args) {

		int[] arr = { 3, 5, 6, 8, 9 };
//		int search = 16;
//		int flag = 0;
//
//		for (int n : arr) {
//			if (n == search) {
//				flag = 1;
//				break;
//			}
//		}
//
//		if (flag == 1) {
//			System.out.println("Element Found");
//		} else {
//			System.out.println("Element Not Found");
//		}

//		linearSearchWithoutFlag(arr);

		binarySearch(arr);
	}
}
