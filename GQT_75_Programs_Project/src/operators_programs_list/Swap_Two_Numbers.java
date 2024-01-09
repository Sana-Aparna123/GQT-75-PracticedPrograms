package operators_programs_list;

import java.util.Scanner;

public class Swap_Two_Numbers {

	public static void main(String[] args) {
		// 51. Write a Java program to swap two numbers without using a temporary
		// variable.
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1:");
		int num1 = sc.nextInt();
		System.out.println("enter num2:");
		int num2 = sc.nextInt();
		System.out.println("before swapnning num1 is " + num1 + " and num2 is " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("before swapnning num1 is " + num1 + " and num2 is " + num2);

	}

}
