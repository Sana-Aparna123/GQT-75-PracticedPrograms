package arrays_25_programs_list;

import java.util.Scanner;

public class Leaders_Elements_In_array {

	public static void main(String[] args) {
		// 22. Create a program to find the leaders in an array (elements larger than
		// all elements to their right).
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter size:");
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		System.out.println("Enter elements in array:");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
		int[] arr={16, 17, 4, 3, 5, 2};

		for (int i = 0; i < arr.length; i++) {
			boolean leader = true;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j])
					leader = false;

			}
			if (leader) {
				System.out.println(arr[i]);
			}
		}
	}

}
