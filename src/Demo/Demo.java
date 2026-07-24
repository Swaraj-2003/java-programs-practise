package Demo;

import java.util.Scanner;

public class Demo {
	public static void CheckEvenNumber(int num) {
		if (num % 2 == 0) {
			System.out.println("the num " + num + " is even");
		} else {
			System.out.println("the num " + num + " is not even");
		}
	}

//	public static void CalculateEvenOddNumbers(int num) {
//
//		int even = 0;
//		int odd = 0;
//		for (int i = 1; i <= num; i++) {
//			if (i % 2 == 0) {
//				even += i;
//			} else {
//				odd += i;
//			}
//		}
//		System.out.println("Even numbers total are : " + even);
//		System.out.println("Odd numbers total are : " + odd);
//	}

//	public static void swap(int a, int b) {
//
//		a = a + b;
//		b = a - b;
//		a = a - b;
//
//		System.out.println(a);
//		System.out.println(b);
//	}

//	public static void GuesstheNumber(int num, int num2) {
//		Scanner sc = new Scanner(System.in);
//		while (true) {
//			if (num == num2) {
//				System.out.println("your guess is coorect");
//				break;
//			} else if (num > num2) {
//				System.out.println("the number is big");
//				System.out.println("guess one more time");
//				num2 = sc.nextInt();
//			} else {
//				System.out.println("the number is small");
//				System.out.println("guess one more time");
//				num2 = sc.nextInt();
//			}
//		}
//	}

//	public static void Printpyramid() {
//		int n = 5;
//		for (int i = 1; i <= n; i++) {
//			for (int k = n - 1; k >= i; k--) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= (2 * i - 1); j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}

//	public static void PrintDiamond() {
//		int n = 5;
//		for (int i = 1; i <= n; i++) {
//			for (int k = n - 1; k >= i; k--) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= (2 * i - 1); j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		for (int i = n - 1; i >= 1; i--) {
//
//			for (int k = n; k > i; k--) {
//				System.out.print(" ");
//			}
//
//			for (int j = (2 * i - 1); j >= 1; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//	}

//	public static void FloydsTriangle() {
//		int num = 5;
//		int 
//		for (int i = 1; i <= 5; i++) {
//			for(int j=1;j<=i;j++) {
//				
//			}
//		}
//	}

	public static void main(String[] args) {
//		Scanner  sc =new Scanner(System.in);
//		System.out.println("Enter a number");
//		int num=sc.nextInt();
		//
//		int temp=num;
//		int smallest=num;
		//
//		while(temp>0) {
//			int digit=temp%10;
//			if(smallest>digit) {
//				smallest=digit;
//			}
//			temp=temp/10;
//		}
		//
//		System.out.println(smallest);

//		Scanner sc =new Scanner(System.in);
//		System.out.println("enter a number");
//		int n=sc.nextInt();
//		int sum=0;
		//
//		while(n>0) {
//			int digit=n%10;
//			if(digit%2!=0) {
//				sum+=digit;
//			}
//			n=n/10;
//		}
//		System.out.println(sum);

//			Perfect Number Program
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number");
//		int num=sc.nextInt();
//		int sum=1;
//		int temp=num;
//		int n=2;
//		//12
//		while(n<num) {
//			if(num%n==0) {
//				sum=sum+n;
//			}
//			n++;
//		}
		//
//		if(sum==num) {
//			System.out.println("the number " + num + " is a perfect number");
//		}
//		else {
//			System.out.println("the number " +num+" is not a  perfect number");
//		}

//			Strong Number
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter a number");
//			int num = sc.nextInt();
//			int fact = 1;
//			int sum = 0;
//			int temp = num;
//			// 145
//			while (temp > 0) {
//				fact = 1;
//				int digit = temp % 10;
//				for (int i = digit; i > 0; i--) {
//					fact = fact * i;
//				}
//				sum += fact;
//				temp = temp / 10;
//			}
		//
//			if (sum == num) {
//				System.out.println("the num " + num + " is a strong number");
//			} else {
//				System.out.println("the num " + num + " is not a  strong number");
//			}

//			for (int i = 1; i <= 100; i++) {
//				if (i % 3 == 0) {
//					System.out.print(i + ",");
//				}
//			}
//			System.out.println();
//			for (int i = 1; i <= 100; i++) {
//				if (i % 5 == 0) {
//					System.out.print(i + ",");
//				}
//			}

//			print all prime numbers from 1 to 100
//			int count = 0;
//			for (int i = 2; i <= 100; i++) {
//				count = 0;
//				for (int j = 2; j < i; j++) {
//					if (i % j == 0) {
//						count++;
//					}
//				}
//				if (count == 0) {
//					System.out.print(i + ",");
//				}
//			}

//			print all armstrong numbers from 1 to 100
//			int armstrong = 0;
//			for (int i = 1; i <= 200; i++) {
//				armstrong = 0;
//				int count = 0;
//				int num = i;
//				while (num > 0) {
//					num = num / 10;
//					count++;
//				}
//				int num2 = i;
//				while (num2 > 0) {
//					int digit = num2 % 10;
//					armstrong = armstrong + (int) Math.pow(digit, count);
//					num2 = num2 / 10;
//				}
		//
//				if (armstrong == i) {
//					System.out.print(i + ",");
//				}
//			}

//			print all palindrome numbers from 1 to 1000

//			int palindrome = 0;
//			for (int i = 1; i <= 1000; i++) {
//				palindrome = 0;
//				int num = i;
//				while (num > 0) {
//					int digit = num % 10;
//					palindrome = palindrome * 10 + digit;
//					num = num / 10;
//				}
		//
//				if (i == palindrome) {
//					System.out.print(i + ",");
//				}
//			}

//			print the multiplication table

//			for (int i = 1; i <= 10; i++) {
//				System.out.println("2" + "*" + i + "=" + 2 * i);
//			}
		//
//			System.out.println();
		//
//			for (int i = 1; i <= 10; i++) {
//				System.out.println("3" + "*" + i + "=" + 3 * i);
//			}
		//
//			System.out.println();
		//
//			for (int i = 1; i <= 10; i++) {
//				System.out.println("4" + "*" + i + "=" + 4 * i);
//			}
		//
//			System.out.println();
//			for (int i = 1; i <= 10; i++) {
//				System.out.println("5" + "*" + i + "=" + 5 * i);
//			}
//			System.out.println();

//			print the lcm of two numbers

//			int num1 = 68;
//			int num2 = 48;
		//
//			int lcm = (num1 < num2) ? num2 : num1;
		//
//			while (true) {
//				if (lcm % num1 == 0 && lcm % num2 == 0) {
//					System.out.println(lcm);
//					break;
		//
//				}
//				lcm++;
//			}

//			CalculateEvenOddNumbers(20);
//			swap(10, 20);

//			Scanner sc = new Scanner(System.in);
//			System.out.println("guess the number from 1 t0 10 : ");
//			int num2 = sc.nextInt();
//			int num = (int) (Math.random() * 10);
//			GuesstheNumber(num, num2);
		//

//			Printpyramid();
//			PrintDiamond();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		CheckEvenNumber(num);
		sc.close();
	}
}
