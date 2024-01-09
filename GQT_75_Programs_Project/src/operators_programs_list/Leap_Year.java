package operators_programs_list;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		// 63.	Develop a program to check if a year is a leap year using relational and logical operators.
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year:");
		int year=sc.nextInt();
//		if(year%4 == 0 && year%100 !=0 || year%400==0) {
//			System.out.println(year + " is a leap year");
//		}
//		else {
//			System.out.println(year + " is not a leap year");
//		}
		boolean leapyear=(year%4 == 0 && year%100 !=0 || year%400==0);
		if(leapyear) {
			System.out.println(year + " is an leap year");
		}
		else {
			System.out.println(year + " is not an leap year");
		}

	}

}
