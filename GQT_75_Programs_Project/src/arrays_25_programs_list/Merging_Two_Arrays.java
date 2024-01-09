package arrays_25_programs_list;

import java.util.Scanner;

public class Merging_Two_Arrays {

	public static void main(String[] args) {
		// 10. Implement a program to merge two arrays into a new array.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter size of arr1:");
//		int a = sc.nextInt();
//		System.out.println("enter size of arr2:");
//		int b = sc.nextInt();
//		int c = a + b;
//		int[] arr1 = new int[a];
//		int[] arr2 = new int[b];
//		int[] arr3 = new int[c];
//		System.out.println("enter elements in arr1");
//		for (int i = 0; i < a; i++) {
//			arr1[i] = sc.nextInt();
//		}
//		System.out.println("enter elements in arr2");
//		for (int i = 0; i < b; i++) {
//			arr2[i] = sc.nextInt();
//		}
//		for (int i = 0; i < a; i++) {
//			arr3[i] = arr1[i];
//		}
//		for (int i = 0; i < b; i++) {
//				arr3[a + i] = arr2[i];
//		}
//		
//		for(int i=0;i<arr3.length;i++) {
//			System.out.println(arr3[i]);
//			
//		}
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 5, 6, 7, 8, 9 };
		int c = arr1.length + arr2.length;
		int[] arr3 = new int[c];
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			arr3[arr1.length + i] = arr2[i];
		}
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");

		}

	}

}
