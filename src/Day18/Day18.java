package Day18;

import java.util.Scanner;

public class Day18 {
	public static void countDigits(long num) {
		int evenCount = 0;
		int oddCount = 0;
		long temp = num;
		while (num > 0) {
			long digit = num % 10;
			if (digit % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
			num = num / 10;
		}

		System.out.println("Number is " + temp + " it has " + oddCount + " odds and " + evenCount + " even it is "
				+ (evenCount == oddCount ? " balanced" : " biased"));

	}

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		long[] numbers = new long[5];
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println("Enter your phone number");
//			numbers[i] = sc.nextLong();
//		}
//
//		for (int i = 0; i < numbers.length; i++) {
//			countDigits(numbers[i]);
//		}

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a size of array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter " + (i + 1) + " days income");
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if (sum >= 2000) {
				System.out.println("the target is acheived on day" + (i + 1));
			} else if (sum >= 3500) {
				System.out.println("the target is acheived on day" + (i + 1));
			} else if (sum >= 20000) {
				System.out.println("the target is impossible");
			}

		}

	}
}
