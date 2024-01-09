package arrays_25_programs_list;

import java.util.Scanner;

public class Sorting_Array_Ascending_order {

	public static void main(String[] args) {
		// 6. Create a Java program to check if an array is sorted in ascending order.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter size:");
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		System.out.println("Enter elements in array:");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//
//		}
	  int[] arr= {2,6,1,9,4,5,3};
		boolean sorted = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					sorted = true;
					break;
				}
			}
		}
		if (sorted) {
			System.out.println("The array is sorted in ascending order");
		} else {
			System.out.println("The array is not sorted in ascending order");
		}

	}

}
