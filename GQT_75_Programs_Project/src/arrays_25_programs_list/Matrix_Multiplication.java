package arrays_25_programs_list;

import java.util.Scanner;

public class Matrix_Multiplication {

	public static void main(String[] args) {
		// 23. Implement a Java program to perform matrix multiplication
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of arr1:");
		int row1 = sc.nextInt();
		int col1 = sc.nextInt();
		System.out.println("enter size of arr2:");
		int row2 = sc.nextInt();
		int col2 = sc.nextInt();

		int[][] arr1 = new int[row1][col1];

		int[][] arr2 = new int[row2][col2];

		int[][] arr3 = new int[col1][row2];
		System.out.println("enter elements in arr1");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				arr1[i][j] = sc.nextInt();
			}

		}

		System.out.println("enter elements in arr2");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				arr2[i][j] = sc.nextInt();
			}

		}
		if (col1 == row2) {
			for (int i = 0; i < arr3.length; i++) {
				for (int j = 0; j < arr3.length; j++) {
					for (int k = 0; k < arr3.length; k++) {
						arr3[i][j] = arr3[i][j] + arr1[i][k] * arr2[k][j];
					}

				}
			}
			for (int i = 0; i < arr3.length; i++) {
				for (int j = 0; j < arr3.length; j++) {
					System.out.print(arr3[i][j] + " ");
				}
				System.out.println();
			}
		} else {
			System.out.println("Matrix Multiplication is not posible");
		}
		

//		int[][] arr1= {{1,2,3},{4,5,6},{7,8,9}};
//		int[][] arr2= {{9,8,7},{6,5,4},{3,2,1}};
//		
//		int[][] arr3=new int[arr1.length][arr2[0].length];
//		 
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=0;j<arr2[0].length;j++) {
//				for(int k=0;k<arr2.length;k++) {
//					arr3[i][j]+=arr1[i][k]*arr2[k][j];
//					
//				}
//			}
//		}
//		
//		for(int i=0;i<arr3.length;i++) {
//			for(int j=0;j<arr3[0].length;j++) {
//				System.out.print(arr3[i][j] + " ");
//			}
//			System.out.println();
//		}
	}

}
