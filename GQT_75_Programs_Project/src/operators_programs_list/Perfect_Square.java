package operators_programs_list;

import java.util.Scanner;

public class Perfect_Square {

	public static void main(String[] args) {
		// 72. Create a program to check if a number is a perfect square using the Math
		// class.
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int number = sc.nextInt();
		double squareroot = Math.sqrt(number);
		boolean perfectSquare = squareroot - Math.floor(squareroot) == 0;
		if (perfectSquare) {
			System.out.println(number + " is a perfect square");
		} else {
			System.out.println(number + " is not a perfect number");
		}
	}

}
