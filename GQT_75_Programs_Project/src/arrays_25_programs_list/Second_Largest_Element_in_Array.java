package arrays_25_programs_list;

import java.util.Arrays;
import java.util.Scanner;

public class Second_Largest_Element_in_Array {

	public static void main(String[] args) {
		// 8. Write a program to find the second largest element in an array.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter size:");
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		System.out.println("enter elements in an array");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		int temp = 0;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] < arr[j]) {
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//
//			}
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		System.out.println();
//		System.out.println("second largest element in an array:" +arr[1]);
//		System.out.println("second largest element in an array:" +arr[arr.length-2]);
		int[] arr= {23,24,11,2,7,16,45};
		Arrays.sort(arr);
	    for(int i=0;i<arr.length;i++) {
	    	System.out.println(arr[i]);
	    }
	    System.out.println("second largest element:");
		System.out.println(arr[arr.length-2]);
		
	}

}
