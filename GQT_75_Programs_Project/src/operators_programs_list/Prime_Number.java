package operators_programs_list;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		// 55. Develop a Java program to check if a number is a prime number using
		// logical operators.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		boolean prime = primeNumber(number);
		if (prime) {
			System.out.println("prime number");
		} else {
			System.out.println("not an prime number");
		}
	}

	private static boolean primeNumber(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <=Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;

	}

}
