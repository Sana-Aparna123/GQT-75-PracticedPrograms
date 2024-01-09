package operators_programs_list;

import java.util.Scanner;

public class Left_Shift_Binary_Number {

	public static void main(String[] args) {
		// Implement a program to perform left shift on a binary number.
		int binaryNumber=0b10101;
		int shiftCount=2;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter binary number:");
//		int binaryNumber=sc.nextInt();
//		System.out.println("enter leftShift:");
//		int shiftCount=sc.nextInt();
		int leftShift=binaryNumber << shiftCount;
		System.out.println("left shift on a binary number:" + Integer.toBinaryString(leftShift));

	}

}
