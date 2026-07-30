package Day19;

import java.util.Scanner;

public class Day19 {
	public static int totalNotes(int amount, int[] arr) {
		int notes = 0;
		int i = 0;
		int remainamount = 0;
		while (amount > 0) {
			remainamount = amount % arr[i];
			notes = notes + amount / arr[i];
			amount = remainamount;
			i++;
		}

		return notes;
	}

	public static void main(String[] args) {
		int[] arr = { 500, 200, 100, 50, 20, 10 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter exchange amount");
		int amount = sc.nextInt();
		int notes = totalNotes(amount, arr);
		System.out.println(notes);
	}
}
