package arrays_25_programs_list;

import java.util.Scanner;

public class Reverse_Array_Elements {

	public static void main(String[] args) {
		// 5.	Write a program to reverse the elements of an array.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter size:");
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		System.out.println("enter elements in array:");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
		int[] arr= {1,2,3,4,5};
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}

	}

}
