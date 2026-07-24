package Day1;

import java.util.Scanner;

public class Palindrome {
	public static int checkPalindrome(int num) {
		int temp = num;
		int rev = 0;
		while (temp > 0) {
			int digit = temp % 10;
			rev = rev * 10 + digit;
			temp = temp / 10;
		}

		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();

		int reverse = checkPalindrome(num);
		if (num == reverse) {
			System.out.println("the num is palindrome");
		} else {
			System.out.println("the num is not  palindrome");
		}
	}
}
