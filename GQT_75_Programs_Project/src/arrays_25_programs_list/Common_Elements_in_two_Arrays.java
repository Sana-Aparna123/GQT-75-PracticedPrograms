package arrays_25_programs_list;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Common_Elements_in_two_Arrays {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter size of arr1");
//		int a = sc.nextInt();
//		System.out.println("Enter size of arr2");
//		int b = sc.nextInt();
//		int[] arr1 = new int[a];
//		int[] arr2 = new int[b];
//		System.out.println("enter elements in arr1:");
//		for (int i = 0; i < arr1.length; i++) {
//			arr1[i] = sc.nextInt();
//		}
//		System.out.println("enter elements in arr2:");
//		for (int i = 0; i < arr2.length; i++) {
//			arr2[i] = sc.nextInt();
//		}
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {2,3,4,5,6,7};

		Set<Integer> ce = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			ce.add(arr1[i]);
		}
		System.out.println("Common elements in two arrays");
		for (int i = 0; i < arr2.length; i++) {
			if (ce.contains(arr2[i])) {
				System.out.print(arr2[i] + " ");
			}
		}

	}

}
