package arrays_25_programs_list;

import java.util.Scanner;

public class Frequency_Each_Element_In_Array {

	public static void main(String[] args) {
		// 16. Develop a Java program to find the frequency of each element in an array.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter size:");
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		System.out.println("enter elements in array:");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
		int[] arr= {1,1,2,2,2,3,4,5,5,};
//		for (int i = 0; i < arr.length; i++) {
//			int count = 0;
//			for (int j =0; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					count++;
//				}
//				
//			}
//			System.out.println(arr[i] + "-" + count);
//		}
		int len[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			len[i] = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == arr[i]) {
					len[i]++;
					arr[j] = 0;
				}
			}
		}

		for (int i = 0; i < len.length; i++) {
			if (arr[i] == 0) {

			} else {
				System.out.println(arr[i] + " repeats " + len[i]+" times");
			}

	}

}
}
