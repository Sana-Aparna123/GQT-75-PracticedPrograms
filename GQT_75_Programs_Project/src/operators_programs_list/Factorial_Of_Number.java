package operators_programs_list;

import java.util.Scanner;

public class Factorial_Of_Number {

	public static void main(String[] args) {
		// 64.	Create a Java program to calculate the factorial of a number using the 
		//assignment and multiplication operators.
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int fact=1;
		for (int i=1;i<=n;i++) {
			fact*=i;
		}
		System.out.println(fact);
		

	}

}
