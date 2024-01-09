package operators_programs_list;

import java.util.Scanner;

public class Array_Incremenent_Constant_Value {

	public static void main(String[] args) {
		// 70. Write a Java program to increment each element of an array by a constant
		// value.
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size:");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("enter elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter constant number:");
		int con = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			arr[i] += con;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
