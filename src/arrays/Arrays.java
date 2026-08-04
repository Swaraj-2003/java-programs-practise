package arrays;

public class Arrays {

	public static int[] twoSum(int[] arr, int target) {
//		3,2,4
		int arr2[] = new int[2];
		int index = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int sum = arr[i] + arr[j];
				if (sum == target) {
					arr2[index] = i;
					index++;
					arr2[index] = j;
					break;
				}
			}
		}

		return arr2;

	}

	public static void prefixSum1(int[] arr) {
//		1,2,3,4
//		24,12,8,6
		int[] prefixSum = new int[arr.length];
		prefixSum[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			prefixSum[i] = prefixSum[i - 1] * arr[i];
		}

		System.out.println(java.util.Arrays.toString(prefixSum));
	}

	public static void productOfArray(int[] arr) {
		int arr2[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int n = prefixSum(arr);
			arr2[i] = n / arr[i];
		}

		System.out.println(java.util.Arrays.toString(arr2));
	}

	public static int prefixSum(int[] arr) {
		int sum = 1;
		for (int i = 0; i < arr.length; i++) {
			sum = sum * arr[i];
		}
		return sum;
	}

	public static int buyAndSellStock(int[] nums) {
		int profit = 0;
		int maxProfit = 0;
		int minprice = nums[0];
		for (int i = 1; i < nums.length; i++) {
//			int[] nums = { 5,4,10 };
			if (nums[i] < minprice) {
				minprice = nums[i];
			}
			profit = nums[i] - minprice;
			if (maxProfit < profit) {
				maxProfit = profit;
			}
		}
		return maxProfit;
	}

//	public static int buyAndSellStock(int[] nums) {
//		int profit = 0;
//		int maxProfit = 0;
//		for (int i = 0; i < nums.length - 1; i++) {
//			profit = 0;
////			int[] nums = { 7, 1, 5, 3, 6, 4 };
//			for (int j = i + 1; j < nums.length; j++) {
//				profit = nums[j] - nums[i];
//				if (maxProfit < profit) {
//					maxProfit = profit;
//				}
//			}
//		}
//
//		return maxProfit;
//	}

	public static int maxSubArray1KadanesAlgo(int[] nums) {
//		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (sum < 0) {
				sum = 0;
			}
			sum += nums[i];
			if (maxSum < sum) {
				maxSum = sum;
			}
		}
		return maxSum;
	}

	public static int maxSubArray(int[] nums) {
//		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum = sum + nums[j];
				if (maxSum < sum) {
					maxSum = sum;
				}
			}

		}
		return maxSum;
	}

	public static int findMajorityElement(int[] arr) {
//		int[] arr = { 1,1,1,2,2,2,2};
		int num = arr.length / 2;
		java.util.Arrays.sort(arr);
		int result = 0;
		int count = 1;
		int i = 0;
		int index = i - 1;
		while (i < arr.length) {
			if (index >= 0 && arr[i] == arr[index]) {
				count++;
				i++;
				index++;
			} else if (index >= 0 && arr[i] > arr[index]) {
				count = 1;
				i++;
				index++;
			} else {
				i++;
				index++;
			}
			if (count > num) {
				result = arr[index];
				return result;
			}
		}
		return result;
	}

	public static int findEquilibriumIndex1(int[] arr) {
//		int[] arr = { 1, 3, 5, 2, 2 };
		int totalSum = 0;
		for (int i = 0; i < arr.length; i++) {
			totalSum += arr[i];
		}

		int leftsum = 0;
		for (int i = 0; i < arr.length; i++) {
			int index = i - 1;
			if (index >= 0) {
				leftsum += arr[index];
			}

			int rightSum = totalSum - leftsum - arr[i];
			if (rightSum == leftsum) {
				return i;
			}
		}

		return -1;
	}

	public static int findEquilibriumIndex(int[] arr) {
//		int[] arr = { 1, 3, 5, 2, 2 };
		int leftSum = 0;
		int rightSum = 0;
		int i = 0;
		if (arr.length == 1) {
			return 0;
		}
		while (i < arr.length) {
			rightSum = 0;
			leftSum = 0;
			int j = i + 1;
			while (j < arr.length) {
				rightSum += arr[j];
				j++;
			}
			int k = i - 1;
			while (k >= 0) {
				leftSum += arr[k];
				k--;
			}

			if (leftSum == rightSum) {
				return i;
			}
			i++;
		}

		return -1;
	}

	public static void findLeaders(int[] arr) {
		System.out.println(arr[arr.length - 1]);
//			int[] arr = { 16, 17, 4, 3, 5, 2 };
		int i = arr.length - 1;
		int j = arr.length - 2;
		while (j >= 0) {
			if (arr[j] >= arr[i]) {
				System.out.println(arr[j]);
				i = j;
				j--;
			} else {
				j--;
			}
		}
	}

//	public static int[] intersectionOfArray1(int[] arr1, int arr2[]) {
//		int[] arr3 = new int[(arr1.length > arr2.length ? arr2.length : arr1.length)];
//		int index = 0;
//		int i = 0;
//		int j = 0;
//		java.util.Arrays.sort(arr1);
//		java.util.Arrays.sort(arr2);
//
//		while (i < arr1.length && j < arr2.length) {
////			if (i > 0 && arr1[i] == arr1[i - 1]) {
////				i++;
////				continue;
////			}
//			if (arr1[i] == arr2[j]) {
//				arr3[index] = arr1[i];
//				i++;
//
//				j++;
//				index++;
//			} else if (arr1[i] < arr2[j]) {
//				i++;
//
//			} else {
//				j++;
//			}
//		}
//
//		return java.util.Arrays.copyOf(arr3, index);
//	}

//	public static int[] intersectionOfArray(int[] arr1, int arr2[]) {
//
//		int[] arr3 = new int[(arr1.length > arr2.length ? arr2.length : arr1.length)];
//		int index = 0;
//		int i = 0;
//		java.util.Arrays.sort(arr1);
//		java.util.Arrays.sort(arr2);
//		while (i < arr1.length) {
//			int count = 0;
//			int k = i - 1;
//			while (k >= 0) {
//				if (arr1[i] == arr1[k]) {
//					count++;
//				}
//				k--;
//			}
//			if (count > 0) {
//				i++;
//				continue;
//			}
//			boolean isDuplicate = false;
//			for (int j = 0; j < arr2.length; j++) {
//				if (arr1[i] == arr2[j]) {
//					isDuplicate = true;
//				}
//			}
//			if (isDuplicate) {
//				arr3[index] = arr1[i];
//				index++;
//			}
//			i++;
//		}
//
//		return java.util.Arrays.copyOf(arr3, index);
//	}

	public static void displayUnion(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			boolean istrue = false;
			int k = i - 1;
			while (k >= 0) {
				if (arr1[i] == arr1[k]) {
					istrue = true;
				}
				k--;
			}
			if (istrue) {
				continue;
			}

			System.out.println(arr1[i]);
		}
		for (int j = 0; j < arr2.length; j++) {
			boolean istrue = false;
			int k = j - 1;
			while (k >= 0) {
				if (arr2[j] == arr2[k]) {
					istrue = true;
				}
				k--;
			}
			if (istrue) {
				continue;
			}

			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] == arr2[j]) {
					istrue = true;
				}
			}
			if (!istrue) {
				System.out.println(arr2[j]);
			}
		}

	}

	public static void findCommonElements2(int[] arr1, int[] arr2) {
		boolean istrue = false;
		for (int i = 0; i < arr1.length; i++) {
			istrue = false;
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					istrue = true;
				}
			}
			if (istrue) {
				System.out.println(arr1[i]);
			}
		}
	}

	public static void findCommonElements(int[] arr1, int[] arr2) {
//		int[] arr1 = { 1, 2,2, 3, 4, 5, 6, 7 };
//		int[] arr2 = { 1, 2, 2, 8, 9, 4, 6 };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}

	public static void rotateByLeftKPosition(int[] arr, int k) {
//int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
//		int[] arr = { 7,6,5,4,3,2,1 };
		k = k % arr.length;
		reverse(arr, 0, arr.length - 1);
		reverse(arr, arr.length - k, arr.length - 1);
		reverse(arr, 0, arr.length - k - 1);
	}

	public static void reverse(int[] arr, int i, int j) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

//	public static void rotateByKPosition(int[] arr, int k) {
////		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
//		k = k % arr.length;
//		k = arr.length - k;
//		reverse(arr, 0, arr.length - 1);
//		reverse(arr, 0, k - 1);
//		reverse(arr, k, arr.length - 1);
//	}
//
//	public static void reverse(int[] arr, int i, int j) {
//		while (i < j) {
//			int temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp;
//			i++;
//			j--;
//		}
//	}

//	public static void rotateByKPosition(int[] arr, int k) {
////		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
//		int nums[] = new int[arr.length];
//		int index = 0;
//		int i = Math.abs(arr.length - k);
//		System.out.println(i);
//		while (i < arr.length) {
//			if (index == arr.length) {
//				break;
//			}
//			nums[index] = arr[i];
//			index++;
//			i++;
//			if (i == arr.length) {
//				i = 0;
//			}
//		}
//
//		for (int n : nums) {
//			System.out.print(n + ",");
//		}
//	}

//	public static void mergeTwoArrays(int[] nums1, int m, int[] nums2, int n) {
//		int index = m + n - 1;
//		int i = m - 1;
//		int j = n - 1;
//
//		while (i >= 0 && j >= 0) {
//			if (nums2[j] > nums1[i]) {
//				nums1[index] = nums2[j];
//				index--;
//				j--;
//			} else {
//				nums1[index] = nums1[i];
//				index--;
//				i--;
//			}
//		}
//
//		while (j >= 0) {
//			nums1[index] = nums2[j];
//			index--;
//			j--;
//		}
//	}

//	public static boolean checkSortedRotated(int[] arr) {
////		int []arr= {3,4,5,1,2};
//		int firstEle = arr[0];
//		int count = 0;
//		if (firstEle < arr[arr.length - 1]) {
//			count++;
//		}
//		for (int i = 0; i < arr.length - 1; i++) {
//			if (arr[i] > arr[i + 1]) {
//				count++;
//			}
//		}
//
//		if (count > 1) {
//			return false;
//		}
//		return true;
//	}

//	public static boolean checkIsSorted(int[] arr) {
//		for (int i = 0; i < arr.length - 1; i++) {
//			if (arr[i] > arr[i + 1]) {
//				return false;
//			}
//		}
//		return true;
//	}

//	public static void moveZerosToEnd(int[] arr) {
////		int arr[]= {0,1,0,3,12};
//		int index = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] != 0) {
//				int temp = arr[index];
//				arr[index] = arr[i];
//				arr[i] = temp;
//				index++;
//			}
//		}
//
//		for (int ar : arr) {
//			System.out.println(ar);
//		}
//	}

//	public static int checkMissingNum(int[] arr) {
////		int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
//		java.util.Arrays.sort(arr);
//		for (int i = 0; i < arr.length - 1; i++) {
//			int num1 = arr[i] + 1;
//			if (arr[i + 1] != num1) {
//				return num1;
//			}
//		}
//		return 0;
//	}

//	public static int checkMissingNum(int[] arr) {
//		java.util.Arrays.sort(arr);
//		int num = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] != num) {
//				break;
//			}
//			num++;
//		}
//
//		return num;
//	}

//	public static void removeDuplicates(int[] arr) {
////		int nums[]= {0,0,1,1,2,2,2,3,3,4};
//		int index = 0;
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] != arr[index]) {
//				index++;
//				arr[index] = arr[i];
//			}
//		}
//		for (int n : arr) {
//			System.out.println(n);
//		}
//	}

//	public static boolean containsDuplicate(int[] nums) {
//		if (nums.length == 0) {
//			return false;
//		}
//
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				if (nums[i] == nums[j]) {
//					return true;
//				}
//			}
//		}
//
//		return false;
//	}

//	public static void printDuplicateElements(int[] arr) {
//		if (arr.length == 0) {
//			System.out.println("No elements found");
//			return;
//		} else {
//			int count = 0;
//			boolean[] visited = new boolean[arr.length];
//
//			for (int i = 0; i < arr.length; i++) {
//				if (visited[i]) {
//					continue;
//				}
//				count = 0;
//				for (int j = 0; j < arr.length; j++) {
//					if (arr[i] == arr[j]) {
//						count++;
//						visited[j] = true;
//					}
//				}
//				if (count > 1) {
//					System.out.println(arr[i]);
//				}
//			}
//
//		}
//	}
//
//	public static void countFrquency(int[] arr) {
//
//		if (arr.length == 0) {
//			System.out.println("No elements found");
//			return;
//		} else {
//			int count = 0;
//			boolean[] visited = new boolean[arr.length];
//			for (int i = 0; i < arr.length; i++) {
//				if (visited[i] == true) {
//					continue;
//				}
//				count = 0;
//				for (int j = 0; j < arr.length; j++) {
//					if (arr[i] == arr[j]) {
//						count++;
//						visited[j] = true;
//					}
//				}
//				System.out.println(arr[i] + "=" + count);
//			}
//
//		}
//
//	}
//	public static void countPosNegZer(int[] arr) {
//		int positive = 0;
//		int negative = 0;
//		int zeros = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > 0) {
//				positive++;
//			} else if (arr[i] < 0) {
//				negative++;
//			} else {
//				zeros++;
//			}
//		}
//		System.out.println("the no of positives " + positive);
//		System.out.println("the no of Negatives " + negative);
//		System.out.println("the no of zeros " + zeros);
//
//	}

//	public static int findSecondSmallest(int[] arr) {
//		int smallest = arr[0];
//		int secondSmallest = arr[0];
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] < smallest) {
//				secondSmallest = smallest;
//				smallest = arr[i];
//			} else if (arr[i] < secondSmallest && arr[i] != smallest) {
//				secondSmallest = arr[i];
//			}
//		}
//		return secondSmallest;
//	}

//	public static int findSecondlargest(int[] arr) {
////		int[] arr = { 34, 21, 32, 76, 98, 24, 43, 504 };
//		int largest = 0;
//		int Seclargest = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > largest) {
//				Seclargest = largest;
//				largest = arr[i];
//			} else if (arr[i] > Seclargest && arr[i]!=largest) {
//				Seclargest = arr[i];
//			}
//		}
//
//		return Seclargest;
//	}

//	public static int[] reverse(int[] arr) {
//
//		int start = 0;
//		int end = arr.length - 1;
//		while (start < end) {
//			int temp = arr[start];
//			arr[start] = arr[end];
//			arr[end] = temp;
//
//			start++;
//			end--;
//		}
//
//		return arr;
//
//	}
//	public static boolean findElement(int[] arr, int target) {
//
//		for (int ar : arr) {
//			if (ar == target) {
//				return true;
//			}
//		}
//		return false;
//	}

	public static void main(String[] args) {
//		int[] arr = new int[5];
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
//
//		for (int ar : arr) {
//			System.out.println(ar);
//		}

//		int arr[] = { 12, 13, 14, 15 };
//		System.out.println(arr[4]);

//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("enter any 5 numbers");
//		int[] arr = new int[5];
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

//		int arr[] = { 20, 33, 12, 43, 3 };
//		int sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			sum = sum + arr[i];
//		}
//
//		System.out.println(sum);

//		int arr[] = { 20, 33, 12, 43, 3 };
//		int product = 1;
//		for (int i = 0; i < arr.length; i++) {
//			product = product * arr[i];
//		}
//
//		System.out.println(product);

//		int arr[] = { 20, 33, 12, 43, 3 };
//
//		int max = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//		}
//
//		System.out.println(max);
//		int arr[] = { 20, 33, 12, 43, 7 };
//		int min = arr[0];
//
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] < min) {
//				min = arr[i];
//			}
//		}
//
//		System.out.println(min);

//		find average of elemets

//		int arr[] = { 12, 42, 35, 94, 18 };
//		int n = arr.length;
//		int sum = 0;
//
//		for (int i = 0; i < n; i++) {
//			sum += arr[i];
//		}
//
//		double average = sum / n;
//		System.out.println(average);

//		int arr[] = { 12, 41, 54, 21, 81 };
//
//		int even = 0;
//		int odd = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] % 2 == 0) {
//				even++;
//			} else {
//				odd++;
//			}
//		}
//
//		System.out.println("the even  numbers is " + even);
//		System.out.println("the odd  numbers is " + odd);

//		int arr[] = { 12, 41, 54, 21, 81 };
//
//		int Evenarr[] = new int[arr.length];
//		int Oddarr[] = new int[arr.length];
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] % 2 == 0) {
//				Evenarr[i] = arr[i];
//			} else {
//				Oddarr[i] = arr[i];
//			}
//		}
//
//		for (int ar : Evenarr) {
//			System.out.println(ar);
//		}
//
//		for (int ar : Oddarr) {
//			System.out.println(ar);
//		}

//		int[] arr = { 23, 43, 22, 1, 56, 4 };
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number to find :");
//		int num = sc.nextInt();
//
//		boolean result = findElement(arr, num);
//		if (result) {
//			System.out.println("the num is present ");
//		} else {
//			System.out.println("the num is not present ");
//		}

//		int[] arr = { 34, 12, 10, 23, 12, 86 };
//
//		int[] result = reverse(arr);
//
//		for (int i : result) {
//			System.out.println(i);
//		}

//		int[] arr = { 34, 21, 32, 76, 98, 24, 43, 102, 503, 120 };
//
//		int result = findSecondlargest(arr);
//
//		System.out.println(result);

//		int[] arr = { 5, 5, 8, 10 };
//
//		int result = findSecondSmallest(arr);
//
//		System.out.println(result);
//
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);

//		int[] arr = { 34, 21, 32, -17, 0, 12, -3, 0, 10, -2 };
//
//		countPosNegZer(arr);

//		int[] arr = { 1, 2, 2, 3, 1, 4, 2 };
//
//		countFrquency(arr);

//		int[] arr = { 1, 2, 2, 3, 1, 4, 2 };
//		int[] arr = { 1, 2, 2, 3, 1, 4, 5, 5 };
//
//		printDuplicateElements(arr);

//		int[] nums = { 1 };
//
//		boolean result = containsDuplicate(nums);
//		System.out.println(result);

//		int nums[] = { 0, 0, 1, 1, 2, 2, 2, 3, 3, 4 };
//
//		removeDuplicates(nums);

//		int[] arr = { 3, 0, 1 };
//
//		int num = checkMissingNum(arr);
//		System.out.println(num);

//		int arr[] = { 0,1,0,3,12 };
//
//		moveZerosToEnd(arr);

//		int[] arr = { 11, 23, 45, 67 };
//
//		boolean sorted = checkIsSorted(arr);
//		if (sorted) {
//			System.out.println("the array is sorted");
//		} else {
//			System.out.println("the array is not sorted");
//		}
//
//		int[] arr = { 2, 2, 2, 2 };
//		boolean isSortedRoatated = checkSortedRotated(arr);
//
//		if (isSortedRoatated) {
//			System.out.println("the array is sorted and rotated");
//		} else {
//			System.out.println("the array is not sorted");
//		}
//
//		int[] arr1 = { 1,2,3};
//		int[] arr2 = { 2, 5, 6 };
//
//		System.out.println(arr1.length);
//		mergeTwoArrays(arr1,arr1.length,arr2,arr2.length);

//		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
//		int k = 3;
//		rotateByLeftKPosition(arr, k);
//		System.out.println(java.util.Arrays.toString(arr));

//		int[] arr1 = { 1, 2, 3, 4, 5, 5, 6, 7 };
//		int[] arr2 = { 8, 2, 2, 5, 6, 6 };
//
//		findCommonElements2(arr1, arr2);

//		int[] arr1 = { 1, 2, 3, 4, 5, 5, 6, 7 };
//		int[] arr2 = { 8, 2, 2, 5, 6, 6 };
//
//		displayUnion(arr1, arr2);
//
//		int[] arr1 = { 4, 9, 5 };
//		int arr2[] = { 9, 4, 9, 8, 4 };

//		int[] arr1 = { 1, 2, 2, 2, 3 };
//		int arr2[] = { 2, 2 };
//
//		int[] arr3 = intersectionOfArray(arr1, arr2);
//		System.out.println(java.util.Arrays.toString(arr3));
//		int[] arr3 = intersectionOfArray1(arr1, arr2);
//		System.out.println(java.util.Arrays.toString(arr3));

//		int[] arr = { 1, 3, 5, 2, 2 };

//		findLeaders(arr);
//		int ans = findEquilibriumIndex(arr);
//		System.out.println(ans);

//		int[] arr = { 1, 2, 3 };
//		int ans = findEquilibriumIndex1(arr);
//		System.out.println(ans);

//		int[] arr = { 1, 2, 1, 2, 1 };
//
//		int ans = findMajorityElement(arr);
//		System.out.println(ans);

//		int[] nums = { 1 };
//		int result = maxSubArray1KadanesAlgo(nums);
//		System.out.println(result);

//		int[] nums = { 7, 1, 5, 3, 6, 4 };
//		int result = buyAndSellStock(nums);
//		System.out.println(result);
//
//		System.out.println(9 / 0);
//		int[] arr = { 1, 2, 3, 4 };
//		productOfArray(arr);

//		int arr[] = { 1, 2, 3, 4 };
//		prefixSum1(arr);

		int[] arr = { 3, 2, 4 };
		int target = 5;

		int[] arr1 = twoSum(arr, target);

		System.out.println(java.util.Arrays.toString(arr1));

	}
}
