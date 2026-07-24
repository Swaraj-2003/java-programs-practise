package Day11;

public class Day11 {
	public static void printPrimeNumbers() {
		int count;
		for (int i = 2; i <= 100; i++) {
			count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.print(i + ",");
			}
		}
	}

//	public static void CheckPrime(int num) {
//		int flag = 0;
//		
//				for (int i = 2; i < Math.sqrt(num); i++) {
//					if (num % i == 0) {
//						flag++;
//						break;
//					}
//				}
//		
//				if (flag == 0) {
//					System.out.println("the number " + num + " is prime");
//				} else {
//					System.out.println("the number " + num + " is not prime");
//				}
//
//	}

	public static void main(String[] args) {
//		int armstrong = 0;
//		for (int i = 1; i <= 1000; i++) {
//			armstrong = 0;
//			int count = 0;
//			int num = i;
//			while (num > 0) {
//				num = num / 10;
//				count++;
//			}
//			int num2 = i;
//			while (num2 > 0) {
//				int digit = num2 % 10;
//				armstrong = armstrong + (int) Math.pow(digit, count);
//				num2 = num2 / 10;
//			}
//
//			if (armstrong == i) {
//				System.out.print(i + ",");
//			}
//		}

//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter a number");
//		int num = sc.nextInt();
//		int itterationcount = 0;
//		int flag = 0;
//		for (int i = 2; i < Math.sqrt(num); i++) {
//			itterationcount++;
//			if (num % i == 0) {
//				flag++;
//				break;
//			}
//		}
//
//		if (flag == 0) {
//			System.out.println("the number is prime");
//		} else {
//			System.out.println("the number is not prime");
//		}
//
//		System.out.println(itterationcount);

//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter a number");
//		int num = sc.nextInt();
//		CheckPrime(num);
//		
//		printPrimeNumbers();

//		Time Complexity

//		int num = 67890;
//		int temp = num;
//		int sum = 0;
//		int ans = 0;
//		while (temp > 0) {
//			int digit = temp % 10;
//			sum = sum + digit;
//			temp = temp / 10;
//			if(sum>=10) {
//				
//			}
//		}
//		System.out.println(sum);
////		while (sum >= 10) {
////			int d1 = sum % 10;
////			ans += d1;
////			sum = sum / 10;
////		}
//
//		System.out.println(sum);

		String name = "sanket";
		String name2 = "sanket";

		if (name.equals(name2)) {
			System.out.println("the string is same");
		} else {
			System.out.println("the string is not same");
		}
	}

}
