package strings_25_programs_project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class First_Non_Repeated_CharCters_In_String {

	public static void main(String[] args) {
		// 37. Write a Java program to find the first non-repeated character in a
		// string.
		//String str = "programming";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		
		char nonrepeated = nonRepeatedChracter(str);
		if (nonrepeated != ' ') {
			System.out.println("first non-repeated character in a string is " + nonrepeated);
		} else {
			System.out.println("All characters are repeated in a string " + nonrepeated);
		}

	}

	private static char nonRepeatedChracter(String str) {
		Map<Character, Integer> frequency = new HashMap<>();
		for (char ch : str.toCharArray()) {
			frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
		}
		for (char ch : str.toCharArray()) {
			if (frequency.get(ch) == 1) {
				return ch;
			}
		}
		return ' ';

	}

}
