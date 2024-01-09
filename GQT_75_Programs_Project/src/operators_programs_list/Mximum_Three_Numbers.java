package operators_programs_list;

import java.util.Scanner;

public class Mximum_Three_Numbers {

	public static void main(String[] args) {
		// 60. Create a program to determine the maximum of three numbers using the
		// conditional operator
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1:");
		int num1 = sc.nextInt();
		System.out.println("enter num2:");
		int num2 = sc.nextInt();
		System.out.println("enter num3:");
		int num3 = sc.nextInt();
		int max = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
		System.out.println(max);
	}

}
