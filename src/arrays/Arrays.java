package arrays;

public class Arrays {

	public static boolean checkSortedRotated(int[] arr) {
//		int []arr= {3,4,5,1,2};
		int firstEle = arr[0];
		int count = 0;
		if (firstEle < arr[arr.length - 1]) {
			count++;
		}
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				count++;
			}
		}

		if (count > 1) {
			return false;
		}
		return true;
	}

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

		int[] arr = { 2, 2, 2, 2 };
		boolean isSortedRoatated = checkSortedRotated(arr);

		if (isSortedRoatated) {
			System.out.println("the array is sorted and rotated");
		} else {
			System.out.println("the array is not sorted");
		}

	}
}
