package operators_programs_list;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		// 73. Implement a Java program to calculate the percentage of marks obtained by
		// a student.
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total marks:");
		int totalMarks = sc.nextInt();
		System.out.println("enter obtained marks:");
		int obtainedMarks = sc.nextInt();
		double percentage = (obtainedMarks * 100.0) / totalMarks;
		System.out.println(percentage);

	}

}
