package Day21;

import java.util.Arrays;

public class Day21 {

	public static void insertionSort(int[] arr) {
//		 1, 1, 4, 2, 1, 3

		for (int i = 1; i < arr.length; i++) {
			int currValue = arr[i];
			int prev = i - 1;

			while (prev >= 0 && currValue < arr[prev]) {
				arr[prev + 1] = arr[prev];
				prev--;
			}
			arr[prev + 1] = currValue;
		}

		System.out.println(Arrays.toString(arr));
	}

	public static int heightChecker(int[] heights) {

		int[] nums = Arrays.copyOf(heights, heights.length);

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}

		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != heights[i]) {
				count++;
			}
		}

		return count;
	}

	private static void selectionSort() {

		int[] arr = { 3, 5, 8, 4, 2 };

		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + ",");
//		}
		System.out.println(Arrays.toString(arr));

	}

	private static void bubbleSort() {
		int[] arr = { 3, 5, 8, 4, 2 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}

//	public static void insertionSort() {
//		int[] arr = { 7, 6, 9, 8, 3 };
//
//		for (int k = 1; k < arr.length; k++) {
//
//			int temp = arr[k];
//			int j = k - 1;
//
//			while (j >= 0 && temp <= arr[j]) {
//
//				arr[j + 1] = arr[j];
//				j--;
//			}
//			arr[j + 1] = temp;
//		}
//		System.out.println(Arrays.toString(arr));
//	}
//
//	public static void selectionSort() {
//		int arr[] = { 7, 5, 3, 9, 8 };
//
//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//	}

	public static void main(String[] args) {
//		selectionSort();

//		insertionSort();

//		bubbleSort();

//		selectionSort();
//		int[] arr = { 3, 5, 8, 4, 2 };
//
//		int[] new1 = arr;
//
//		System.out.println(Arrays.toString(new1));

		int[] arr = { 3, 5, 8, 4, 2 };
//		int count = heightChecker(arr);
//		System.out.println(count);

		insertionSort(arr);

	}

}
