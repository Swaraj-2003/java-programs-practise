package Day12;

import java.util.Scanner;

public class Day12 {
	public static int checkPrime(int num) {
		int flag = 0;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				flag++;
				return flag;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		int flag = checkPrime(num);
		if (flag == 0) {
			System.out.println(num + " is a prime");
		} else {
			System.out.println(num + " is not a prime");
		}
		sc.close();
	}
}
