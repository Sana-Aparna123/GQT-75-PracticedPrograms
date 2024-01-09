package arrays_25_programs_list;

import java.util.Scanner;

public class Check_Array_Contains_Duplicates_Elements {

	public static void main(String[] args) {
		// 17. Create a program to check if the array contains any duplicate elements.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter size:");
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		System.out.println("enter elements in array:");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
		int[] arr= {1,1,2,3,4,2,2,};
		boolean duplicate = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					duplicate = true;
					break;

				}
			}
		}
		if (duplicate) {
			System.out.println(" array contains  duplicate elements.");
		} else {
			System.out.println("array doesn't contain duplicate elements.");
		}

	}

}
