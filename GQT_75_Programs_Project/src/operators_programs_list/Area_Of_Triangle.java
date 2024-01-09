package operators_programs_list;

import java.util.Scanner;

public class Area_Of_Triangle {

	public static void main(String[] args) {
		// 71.	Develop a program to calculate the area of a triangle using the bitwise shift operator.
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter base:");
//		int base=sc.nextInt();
//		System.out.println("enter height:");
//		int height=sc.nextInt();
//		int area=(base*height)>>>1;
//		System.out.println("area of triangle: "+area);
		
        int base = 5;
        int height = 8;

        int area = (base * height) >>> 1;

        System.out.println("Area of the triangle: " + area);


	}

}
