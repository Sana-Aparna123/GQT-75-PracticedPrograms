package arrays_25_programs_list;

import java.util.Scanner;

public class Search_Element {

	public static void main(String[] args) {
		// 13. Create a Java program to check if a given element is present in an array.
		Scanner sc = new Scanner(System.in);
		boolean found = false;
		System.out.println("enter size:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter elements in array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("enter an element to search:");
		int a = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (i == a) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println(a + " is present in array");
		} else {
			System.out.println(a + " is not present in an array");
		}

	}

}
