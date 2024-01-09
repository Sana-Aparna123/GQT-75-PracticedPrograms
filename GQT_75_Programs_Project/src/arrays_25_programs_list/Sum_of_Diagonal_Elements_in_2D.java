package arrays_25_programs_list;

import java.util.Scanner;

public class Sum_of_Diagonal_Elements_in_2D {

	public static void main(String[] args) {
		// 21.	Write a program to find the sum of diagonal elements in a 2D array.
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter row:");
//		int row=sc.nextInt();
//		System.out.println("Enter column:");
//		int col=sc.nextInt();
//		int[][] arr=new int[row][col];
//		System.out.println("Enter elements of array:");
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length;j++) {
//				arr[i][j]=sc.nextInt();
//			}
//		}
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		System.out.println("the sum of diagonal elements in a 2D array:");
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i][i];
		}
		
		System.out.println(sum);
		
		
		
//	        int[][] matrix = {
//	            {1, 2, 3},
//	            {4, 5, 6},
//	            {7, 8, 9}
//	        };
//
//	        int sum = 0;
//
//	        for (int i = 0; i < matrix.length; i++) {
//	            sum += matrix[i][i];
//	        }
//
//	        System.out.println("Sum of diagonal elements in the 2D array: " + sum);

	}

}
