package operators_programs_list;

import java.util.Scanner;

public class Even_Odd_Program {

	public static void main(String[] args) {
		// 52. Create a program to check if a number is even or odd using the modulus
		// operator.
		Scanner sc = new Scanner(System.in);
		System.out.println("enter s number:");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + " is an even number");
		} else {
			System.out.println(num + " is an odd number");
		}

	}

}
