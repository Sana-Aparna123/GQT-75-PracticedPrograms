package arrays_25_programs_list;

import java.util.Scanner;

public class Minimum_Element_In_Array {

	public static void main(String[] args) {
		// 4. Develop a Java program to find the minimum element in an array.

		Scanner sc = new Scanner(System.in);
		System.out.println("enter size:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements in array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
//		int min=arr[0];
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i]>min) {
//				 min=arr[i];
//			}
//		}
//		System.out.println(max);
		int min = arr[0];// intializing default array size.
		System.out.println("the minimum element in an array:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					min = arr[i];

				}
			}
		}
		System.out.println(min);

	}
}
