package Day13;

import java.util.Scanner;

public class Day13 {
	public static void PrintFabonacciSeries(int num) {
		int n1 = 0;
		int n2 = 1;
		for (int i = 1; i <= num; i++) {
			System.out.println(n1);
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
	}

//	public static int PrintNumber(int num) {
//		int temp = num;
//		int sum = 0;
//		int ans = 0;
//		while (temp > 0) {
//			int digit = temp % 10;
//			sum = sum + digit;
//			temp = temp / 10;
//		}
//		while (sum > 0) {
//			int digit = sum % 10;
//			ans = ans + digit;
//			sum = sum / 10;
//		}
//		return ans;
//	}

//	public static int PrintNum(int num) {
//		while (num > 9) {
//			int sum = 0;
//			while (num > 0) {
//				int digit = num % 10;
//				sum += digit;
//				num = num / 10;
//			}
//			num = sum;
//		}
//
//		return num;
//	}
	public static void main(String[] args) {
//		for (int i = 1; i <= 3; i++) {
//			for (int j = 1; j <= 4; j++) {
//				System.out.println("sheep" + i);
//			}
//		}

//		for (int i = 1; i <= 3; i++) {
//			for (int j = 1; j <= 4; j++) {
//				System.out.println("sheep" + j);
//			}
//		}

//		for (int i = 1; i <= 3; i++) {
//			for (int j = 1; j <= 4; j++) {
//				System.out.println("sheep" + i + "," + j);
//			}
//		}

//		int i = 1;
//		while (i <= 3) {
//			int j = 1;
//			while (j <= 4) {
//				System.out.println("sheep" + i + ",");
//				j++;
//			}
//			i++;
//		}

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
//
//		int ans = PrintNumber(num);
//		System.out.println(ans);
//		int ans = PrintNum(num);
//		System.out.println(ans);
		PrintFabonacciSeries(num);
		sc.close();
	}
}
