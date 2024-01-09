package operators_programs_list;

import java.util.Scanner;

public class Bitwise_AND_Operation {

	public static void main(String[] args) {
		// 57.	Implement a program to perform bitwise AND operation on two integers.
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1:");
		int num1=sc.nextInt();
		System.out.println("enter num2:");
		int num2=sc.nextInt();
		int bitwiseAND=num1 & num2;
		System.out.println(bitwiseAND);

	}

}
