package arrays_25_programs_list;

import java.util.Scanner;

public class Shifting_Array_Elements_To_Left {

	public static void main(String[] args) {
		// Create a Java program to shift the elements of an array to the left
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter elements to shift left positions:");
		int a = sc.nextInt();// how many positions to shift elements that can stored in a variable.
		System.out.println("enter elements in  an array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		for (int i = 0; i < a; i++) {
			int first = arr[0];// first element in array can stored here in variable first .
			int j;
			for (j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];// first elements after that first second element is stored.

			}

			arr[arr.length - 1] = first;//storing last element in first variable
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
