package arrays_25_programs_list;

import java.util.HashSet;
import java.util.Set;

public class Intersection_Of_Two_Arrays {

	public static void main(String[] args) {
		// 12. Develop a program to find the intersection of two arrays.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter size of arr1");
//		int a = sc.nextInt();
//		System.out.println("enter size of arr2");
//		int b = sc.nextInt();
//
//		int[] arr1 = new int[a];
//		int[] arr2 = new int[b];
//
//		System.out.println("enter elements of arr1:");
//		for (int i = 0; i < arr1.length; i++) {
//			arr1[i] = sc.nextInt();
//		}
//		System.out.println("enter elements of arr2:");
//		for (int i = 0; i < arr2.length; i++) {
//			arr2[i] = sc.nextInt();
//		}
		
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};


		intersection(arr1, arr2);

	}

	private static void intersection(int[] arr1, int[] arr2) {
		Set<Integer> hs = new HashSet<>();
		for (int i = 0; i < arr1.length; i++) {
			hs.add(arr1[i]);
		}
		System.out.println("The intersection of two arrays is:");
		for (int i = 0; i < arr2.length; i++) {
			if (hs.contains(arr2[i])) {
				System.out.println(arr2[i]);
			}
		}

//		HashSet<Integer> hs=new HashSet<>();
//		for(int i=0;i<arr1.length;i++) {
//			hs.add(arr1[i]);
//		}
//		
//		for(int i=0;i<arr2.length;i++) {
//			if(hs.contains(arr2[i])) {
//				 hs.add(arr2[i]);
//			}
//		}
//		int[] arr3=new int[hs.size()];
//		System.out.println("The intersection of two arrays is:");
//		for(int i=0;i<arr3.length;i++) {
//			
//		}
//		

	}

}
