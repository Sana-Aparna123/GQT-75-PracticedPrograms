package arrays_25_programs_list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Remove_Duplicate_Elements_in_Array {

	public static void main(String[] args) {
		// 7. Implement a program to remove duplicate elements from an array.
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter elements in array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
//		int arr[]= {1,2,2,3,3,3,4,5,6,7};
//		System.out.println(" remove duplicate elements in array:");
//		Set <Integer> rd=new HashSet<>();	
//		for (int i = 0; i < arr.length; i++) {
//			rd.add(arr[i]);
//			}
//		System.out.println(rd);
		Arrays.sort(arr);
		int rd = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[rd] != arr[i]) {
				rd++;
				arr[rd] = arr[i];

			}

		}
		for (int i = 0; i <=rd; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
