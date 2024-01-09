package arrays_25_programs_list;

import java.util.Scanner;

public class Majority_element_Ocuurences {

	public static void main(String[] args) {
		// 24.Write a program to find the majority element (element occurring more than
		// n/2 times)
		// in an array.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter size:");
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		System.out.println("enter elements:");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		int len[] = new int[n];
//		for (int i = 0; i < n; i++) {
//			len[i] = 1;
//			for (int j = i + 1; j < n; j++) {
//				if (arr[j] == arr[i]) {
//					len[i]++;
//					arr[j] = 0;
//				}
//			}
//		}
//
//		for (int i = 0; i < len.length; i++) {
//		  if(len[i]>n/2) {
//			if (arr[i] == 0) {
//
//			} else {
//				System.out.println(len[i] + "count of" + arr[i]);
//			}
//		  }
//			
//
//		}
//		
		int[] arr = { 3, 3, 4, 2, 4, 4, 2, 4, 4, 4 };
		int n = arr.length;
		int len[] = new int[n];
		for (int i = 0; i < n; i++) {
			len[i] = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] == arr[i]) {
					len[i]++;
					arr[j] = 0;
				}
			}
		}
		for (int i = 0; i < len.length; i++) {

			if (arr[i] == 0) {

			} else {
				System.out.println(arr[i] + " repeats " + len[i] + " times");
			}
		}

		System.out.println("element occurring more than n/2 times:");
		for (int i = 0; i < len.length; i++) {
			if (len[i] > n / 2) {
				if (arr[i] == 0) {

				} else {
					System.out.println(arr[i] + " repeats " + len[i] + " times");
				}
			}
		}

	}
}
