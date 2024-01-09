package arrays_25_programs_list;

import java.util.Scanner;

public class Average_Of_Elements_In_Array {

	public static void main(String[] args) {
		// 2.	Create a program to calculate the average of elements in an array.
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter elements in array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		double average=(double)sum/n;
		System.out.println(average);

	}

}
