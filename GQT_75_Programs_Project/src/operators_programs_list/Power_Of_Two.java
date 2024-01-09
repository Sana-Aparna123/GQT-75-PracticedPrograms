package operators_programs_list;

import java.util.Scanner;

public class Power_Of_Two {

	public static void main(String[] args) {
		// 66.	Write a program to check if a given number is a power of 2 using bitwise operators
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int number=sc.nextInt();
		boolean power=((number)&(number-1))==0;
		if(power) {
			System.out.println(number + " is power of two");
		}
		else {
			System.out.println(number + " is not a power of two");
		}
		

	}

}
