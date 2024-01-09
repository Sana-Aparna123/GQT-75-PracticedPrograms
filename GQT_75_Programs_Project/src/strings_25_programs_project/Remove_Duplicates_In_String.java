package strings_25_programs_project;

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicates_In_String {

	public static void main(String[] args) {
		// 45. Write a Java program to remove the duplicate characters from a string.
		Set<Character> removeduplicate = new HashSet<Character>();
		String str = "Programming";

		for (int i = 0; i < str.length() - 1; i++) {
			for (int j = i + 1; j < str.length(); j++) {
				removeduplicate.add(str.charAt(i));

			}
		}
		System.out.println(removeduplicate);

	}

}
