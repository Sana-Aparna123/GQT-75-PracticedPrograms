package arrays_25_programs_list;

import java.util.Scanner;

public class Maximun_Element_In_Array {

	public static void main(String[] args) {
		// 3. Implement a program to find the maximum element in an array.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter size:");
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		System.out.println("Enter elements in array:");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//
//		}
//		int max=arr[0];
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i]>max) {
//				 max=arr[i];
//			}
//		}
//		System.out.println(max);
		int arr[] = { 2, 4, 54, 23, 45, 10, 79 };
		int max = arr[0];// intializing default array size.
		System.out.println("the maximum element is:");
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];

			}

		}
		System.out.println(max);

	}

}
