package operators_programs_list;

import java.util.Scanner;

public class GCD_Two_Numbers {

	public static void main(String[] args) {
		// 74. Write a program to calculate the GCD (Greatest Common Divisor) of two
		// numbers using the modulus operator.
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number1:");
		int num1 = sc.nextInt();
		System.out.println("enter number2:");
		int num2 = sc.nextInt();
		int gcd = calculateGcd(num1, num2);
		System.out.println(gcd);

	}

	private static int calculateGcd(int num1, int num2) {
		while (num2 != 0) {
			int temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}
		return num1;

	}

}
