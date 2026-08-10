package searching;

import java.util.Arrays;

public class BinarySearch {

	public static int minEatingSpeed(int[] piles, int h) {

		int start = 1;
		int max = piles[0];
		for (int i = 1; i < piles.length; i++) {
			if (piles[i] > max) {
				max = piles[i];
			}
		}

		int ans = -1;
		int end = max;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (isValidAns1(piles, mid, h)) {
				ans = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return ans;

	}

	public static boolean isValidAns1(int[] piles, int mid, int h) {
		int time = 0;
		for (int i = 0; i < piles.length; i++) {
			time += (piles[i] + mid - 1) / mid;
			if (time > h) {
				return false;
			}
		}

		return true;
	}

	public static boolean isValidAns(int[] arr, int mid, int k) {
//		1, 2, 4, 8, 9 }
		int cow = 1;
		int distance = arr[0];
//		mid=4
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - distance >= mid) {
				cow++;
				distance = arr[i];
				if (cow == k) {
					return true;
				}
			}
		}

		return false;
	}

	public static int aggressiveCows(int[] arr, int k) {

		int start = 0;
		Arrays.sort(arr);
		int end = arr[arr.length - 1] - arr[0];
		int ans = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (isValidAns(arr, mid, k)) {
				ans = mid;
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return ans;
	}

	public static int peakIndex(int[] nums) {
		int ans = -1;
		int start = 0;
		int end = nums.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] < nums[mid + 1]) {
				start = mid + 1;
			} else {
				ans = mid;
				end = mid;
			}

		}

		return ans;
	}

	public static int[] searchRange(int nums[], int target) {
		int first = findLeft(nums, target);
		int last = findRight(nums, target);

		return new int[] { first, last };
	}

	private static int findRight(int[] nums, int target) {
		int ans = -1;
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				ans = mid;
				start = mid + 1;
			} else if (nums[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}
		return ans;
	}

	private static int findLeft(int[] nums, int target) {
		int ans = -1;
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				ans = mid;
				end = mid - 1;
			} else if (nums[mid] > target) {
				end = mid - 1;

			} else {
				start = mid + 1;
			}

		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 30, 11, 23, 4, 20 };
		int h = 6;
//		int k = 3;
//		int[] arr2 = searchRange(arr, 8);
//		System.out.println(Arrays.toString(arr2));
//		int n = Integer.MAX_VALUE;
//		int ans = peakIndex(arr);
//		System.out.println(ans);
//		int ans = aggressiveCows(arr, k);
//		System.out.println(ans);

		int ans = minEatingSpeed(arr, h);
		System.out.println(ans);

	}
}
