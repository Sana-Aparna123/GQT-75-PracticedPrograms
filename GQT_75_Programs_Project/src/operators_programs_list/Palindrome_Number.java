package operators_programs_list;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		// 69.	Implement a program to check if a number is a palindrome using arithmetic operators.
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int n=sc.nextInt();
		int rem=0;
		int rev=0;
		int temp=n;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		if(temp==rev) {
			System.out.println (" palindrome");
		}
		else {
			System.out.println( " not  palindrome");
		}
		
	}

}
