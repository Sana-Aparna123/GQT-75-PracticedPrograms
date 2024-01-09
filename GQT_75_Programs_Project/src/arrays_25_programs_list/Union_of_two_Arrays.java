package arrays_25_programs_list;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Union_of_two_Arrays {

	public static void main(String[] args) {
		//15.	Write a program to find the union of two arrays.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter size of arr1");
//		int a = sc.nextInt();
//		System.out.println("enter size of arr2");
//		int b = sc.nextInt();
//
//		int[] arr1 = new int[a];
//		int[] arr2 = new int[b];
//
//		System.out.println("enter elements of arr1:");
//		for (int i = 0; i < arr1.length; i++) {
//			arr1[i] = sc.nextInt();
//		}
//		System.out.println("enter elements of arr2:");
//		for (int i = 0; i < arr2.length; i++) {
//			arr2[i] = sc.nextInt();
//		}
		int[] arr1= {1,2,3,4};
		int[] arr2= {1,2,3,4,5,6};
		union(arr1, arr2);
	}

	private static void union(int[] arr1, int[] arr2) {
		Set<Integer> us = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			us.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			us.add(arr2[i]);
		}
		System.out.println(us);

	}

}
