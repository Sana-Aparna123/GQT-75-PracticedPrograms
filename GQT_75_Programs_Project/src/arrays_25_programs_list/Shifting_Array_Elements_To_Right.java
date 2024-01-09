package arrays_25_programs_list;

import java.util.Scanner;

public class Shifting_Array_Elements_To_Right {

	public static void main(String[] args) {
		// 9. Create a Java program to shift the elements of an array to the right.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter size:");
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		System.out.println("enter elements to shift right positions:");
//		int a = sc.nextInt();// how many positions to shift elements that can stored in a variable.
//		System.out.println("enter elements in  an array:");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//
//		}
		int[] arr= {1,2,3,4,5};
		int a=2;//no of elements to shift
		for (int i = 0; i < a; i++) {
			int last = arr[arr.length - 1];// last element in an array can be stored here in last variable.
			for (int j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];// last elements before that last second element is stored.

			}
			arr[0]=last;// //storing first element in last variable
		}
		for( int i:arr) {
			System.out.print(i + " ");
		}
		
    
	}

}
