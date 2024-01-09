package operators_programs_list;

import java.util.Scanner;

public class Compound_Interest {

	public static void main(String[] args) {
		// 58. Write a Java program to calculate the compound interest using the
		// assignment and exponential operators
		Scanner sc = new Scanner(System.in);
		System.out.println("enter principal:");
		double principal = sc.nextDouble();
		System.out.println("enter rate:");
		double rate = sc.nextDouble();
		System.out.println("enter time:");
		int time = sc.nextInt();
		double compoundInterest = principal * Math.pow((1 + rate), time) - principal;
		System.out.println("compoundInterest for " + time + " years is " + compoundInterest);
	}

}
