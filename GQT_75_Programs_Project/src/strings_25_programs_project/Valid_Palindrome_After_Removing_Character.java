package strings_25_programs_project;

import java.util.Scanner;

public class Valid_Palindrome_After_Removing_Character {

	public static void main(String[] args) {
		// 36. Implement a program to check if a string is a valid palindrome after
		// removing a character.
		// String str = "abca";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.nextLine();
		boolean palindrome = validPalindrome(str);
		if (palindrome) {
			System.out.println(str + " is a valid palindrome after removing a character");
		} else {
			System.out.println(str + " is not a valid palindrome after removing a character");
		}

	}

	private static boolean validPalindrome(String str) {
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				return isPalindrome(str, i + 1, j) || isPalindrome(str, i, j - 1);
			}
			
		}
		return true;

	}

	private static boolean isPalindrome(String str, int start, int end) {
		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;

	}

}
