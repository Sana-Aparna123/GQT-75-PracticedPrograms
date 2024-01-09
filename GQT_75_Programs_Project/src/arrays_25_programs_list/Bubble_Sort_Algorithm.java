package arrays_25_programs_list;

import java.util.Scanner;

public class Bubble_Sort_Algorithm {

	public static void main(String[] args) {
		// 14. Implement a program to sort an array using the bubble sort algorithm.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter size in an array:");
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		System.out.println("enter elements in an array:");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
		int[] arr= {12,24,1,5,67,34,75,23};
		int temp = 0;
//		for (int i = 0; i < n - 1; i++) {
//			for (int j = 0; j < n - i - 1; j++) {
//				if (arr[j] > arr[j + 1]) {
//					temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//
//			}
//		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
		System.out.println("sorted array using bubble sort:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
