package arrays_25_programs_list;

import java.util.Scanner;

public class Even_or_Odd_in_Array {

	public static void main(String[] args) {
		// 19.	Implement a program to separate even and odd numbers in an array.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("even numbers in array are:");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
		System.out.println("odd numbers in array are:");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
		}

	}

}
