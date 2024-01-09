package operators_programs_list;

import java.util.Scanner;

public class Number_Positive_Negative_Zero {

	public static void main(String[] args) {
		// 59. Develop a program to check if a number is positive, negative, or zero
		// using the ternary operator.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = sc.nextInt();
		String res = (number < 0) ? "Negative" : (number > 0) ? "Positive" : "Zero";
		System.out.println(res);

	}

}
