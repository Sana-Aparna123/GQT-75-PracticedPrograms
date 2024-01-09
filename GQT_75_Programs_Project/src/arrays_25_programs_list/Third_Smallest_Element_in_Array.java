package arrays_25_programs_list;

import java.util.Arrays;
import java.util.Scanner;

public class Third_Smallest_Element_in_Array {

	public static void main(String[] args) {
		// 18.	Write a program to find the third smallest element in an array.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
//		int temp=0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]<arr[j]) {
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//				
//			}
//			System.out.println(arr[i]);
//		}
		
		Arrays.sort(arr);
		System.out.println("third smallest element in an array is " +arr[n-3]);
		

	}

}
