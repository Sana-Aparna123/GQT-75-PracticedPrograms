package operators_programs_list;

import java.util.Scanner;

public class SquareRoot_Of_a_Number {

	public static void main(String[] args) {
		// 53.	Implement a Java program to find the square root of a number without using the Math class.
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		double num=sc.nextDouble();
		double square=squareRoot(num);
		System.out.println(square);
	}

	private static double squareRoot(double num) {
		double guess=num/2;
		double epsilon=0.0001;
		while(Math.abs(guess*guess-num)>epsilon) {
			guess=(guess+num/guess)/2;
			}
		return guess;
		
		
	}

}
