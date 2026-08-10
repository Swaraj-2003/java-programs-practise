package Day24;

public class Day24 {
	public static void main(String[] args) {
//		binary search using recursion.
//		int arr[] = { 2, 4, 6, 8, 10, 12 };
//		int start = 0;
//		int end = arr.length - 1;
//		int target = 6;
//		int ans = binarySearch(start, end, arr, target);
//		System.out.println(ans);

		String name = "Alice";
		String name1 = "Alice";

		String name2 = "Ben";

		String st = new String("chris");
		String st2 = new String("chris");

		String s3 = "chris";

		System.out.println(st.equals(s3));
		System.out.println(st == s3);

	}

	public static int binarySearch(int start, int end, int[] arr, int target) {
		if (start > end) {
			return -1;
		}
		int mid = start + (end - start) / 2;
		if (arr[mid] == target) {
			return mid;
		} else if (arr[mid] > target) {
			return binarySearch(start, mid - 1, arr, target);
		} else {
			return binarySearch(mid + 1, end, arr, target);
		}
	}
}
