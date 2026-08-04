package Day20;

import java.util.Scanner;

public class Day20 {
	public static void calculateProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows in matrix A");
		int R1 = sc.nextInt();

		System.out.println("Enter no of columns in matrix A");
		int C1 = sc.nextInt();

		System.out.println("Enter no of rows in matrix B");
		int R2 = sc.nextInt();

		System.out.println("Enter no of columns in matrix B");
		int C2 = sc.nextInt();

		if (C1 == R2) {

			int[][] matrixA = new int[R1][C1];
			int[][] matrixB = new int[R2][C2];
			int[][] matrixC = new int[R1][C2];

			System.out.println("Enter matrixA numbers");
			for (int i = 0; i < R1; i++) {
				for (int j = 0; j < C1; j++) {
					matrixA[i][j] = sc.nextInt();
				}
			}

			System.out.println("Enter matrixB numbers");
			for (int i = 0; i < R2; i++) {
				for (int j = 0; j < C2; j++) {
					matrixB[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < R1; i++) {
				for (int j = 0; j < C2; j++) {
					int sum = 0;
					for (int k = 0; k < R2; k++) {
						sum = sum + matrixA[i][k] * matrixB[j][k];
					}
					matrixC[i][j] = sum;
				}
			}

			for (int i = 0; i < R1; i++) {
				for (int j = 0; j < C1; j++) {
					System.out.print(matrixA[i][j] + "\t");
				}
				System.out.println();
			}

			System.out.println();

			for (int i = 0; i < R2; i++) {
				for (int j = 0; j < C2; j++) {
					System.out.print(matrixB[i][j] + "\t");
				}
				System.out.println();
			}

			System.out.println();
			for (int i = 0; i < R1; i++) {
				for (int j = 0; j < C2; j++) {
					System.out.print(matrixC[i][j] + "\t");
				}
				System.out.println();
			}

		} else {
			System.out.println("mission impossible");
		}
	}

	public static void calculateSum() {
		int arr[][] = new int[3][3];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println("Enter array elements");
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "/t");
			}
			System.out.println();
		}

		for (int i = 0; i < arr.length; i++) {
			int max = arr[0][0];
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
			System.out.println("the maximum of " + (i + 1) + "row " + max);
		}
	}

	public static void main(String[] args) {

//		int arr[][] = new int[3][3];
//
//		Scanner sc = new Scanner(System.in);
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				System.out.println("Enter array elements");
//				arr[i][j] = sc.nextInt();
//			}
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				System.out.print(arr[i][j]+",");
//			}
//			System.out.println();
//		}

//		calculateSum();
		calculateProduct();

	}
}
