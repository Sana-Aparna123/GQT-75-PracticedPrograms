package operators_programs_list;

import java.util.Scanner;

public class Sum_Of_Digits {

	public static void main(String[] args) {
		// 62. Write a program to calculate the sum of digits in a given number using
		// the modulus operator.
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n = sc.nextInt();
		int rem = 0;
		int sum = 0;
		while (n > 0) {
			rem = n % 10;
			sum += rem;
			n = n / 10;

		}
		System.out.println("sum of digits: " +sum);

	}

}
