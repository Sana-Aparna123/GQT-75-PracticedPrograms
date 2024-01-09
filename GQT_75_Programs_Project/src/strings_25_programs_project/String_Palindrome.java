package strings_25_programs_project;

import java.util.Scanner;

public class String_Palindrome {

	public static void main(String[] args) {
		// 27. Create a program to check if a string is a palindrome.
		//String str = "radar";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String str=sc.next();
//		boolean palindrome = true;
//		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
//			if (str.charAt(i) != str.charAt(j)) {
//				palindrome = false;
//				break;
//			}
//
//		}
//		if(palindrome) {
//			System.out.println(str +" is palindrome");
//		}
//		else {
//			System.out.println(str +" is not palindrome");
//		}
		String str2=new String();
		for(int i=str.length()-1;i>=0;i--) {
			str2=str2+str.charAt(i);
		}
		System.out.println(str2);
		if(str.equalsIgnoreCase(str2)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

	

}
