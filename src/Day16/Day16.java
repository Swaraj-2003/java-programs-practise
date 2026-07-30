package Day16;

import java.util.Arrays;
import java.util.Scanner;

public class Day16 {
	private static void reverseArrayNumbers() {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter a number");
			arr[i] = sc.nextInt();
		}

		int[] arr2 = new int[5];

		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			int rev = 0;
			while (temp > 0) {
				int digit = temp % 10;
				rev = rev * 10 + digit;
				temp = temp / 10;
			}
			arr2[i] = rev;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}

		System.out.println();

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + ",");
		}

	}

	public static void calculateSumOfArray() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter a number");
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));

		int sum = 0;
		int even = 0;
		int odd = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (arr[i] % 2 == 0) {
				even += arr[i];
			} else {
				odd += arr[i];
			}
		}

		System.out.println("the sum of array" + sum);
		System.out.println("the sum of even numbers" + even);
		System.out.println("the sum of odd numbers" + odd);

	}

	public static void findMaxNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter a number");
			arr[i] = sc.nextInt();
		}

		int max = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("the maximum number is" + max);

	}

	public static void main(String[] args) {
//		calculateSumOfArray();
//		findMaxNum();
		reverseArrayNumbers();
	}

}
