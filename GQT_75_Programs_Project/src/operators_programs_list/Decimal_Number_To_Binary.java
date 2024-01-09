package operators_programs_list;

import java.util.Scanner;

public class Decimal_Number_To_Binary {

	public static void main(String[] args) {
		// 75.	Develop a program to convert a decimal number to binary without using the Integer.toBinaryString() method.
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int decimalNumber=sc.nextInt();
		String binaryString=binaryConversion(decimalNumber);
		System.out.println(binaryString);
		

	}

	private static String binaryConversion(int decimalNumber) {
		StringBuilder binary=new StringBuilder();
		while(decimalNumber > 0) {
			int remainder=decimalNumber%2;
			binary.insert(0,remainder);
			decimalNumber/=2;
		}
		return binary.toString();	
	}

}
