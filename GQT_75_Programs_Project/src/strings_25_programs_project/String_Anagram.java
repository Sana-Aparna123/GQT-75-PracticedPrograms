package strings_25_programs_project;

import java.util.Arrays;

public class String_Anagram {

	public static void main(String[] args) {
		//30.	Develop a program to check if two strings are anagrams.
		String str1="silent";
		String str2="listen";
		int temp1=0;
		int temp2=0;
		for(int i=0;i<str1.length();i++) {
			temp1+=str1.charAt(i);
		}
		for(int i=0;i<str2.length();i++) {
			temp2+=str2.charAt(i);
		}
		if(temp1==temp2) {
			System.out.println("two strings are anagrams");
		}
		else {
			System.out.println("two strings are not anagrams");
		}
		
//		char[] chararr1=str1.toCharArray();
//		char[] chararr2=str2.toCharArray();
//		
//		Arrays.sort(chararr1);
//		Arrays.sort(chararr2);
//		
//		System.out.println(chararr1);
//		System.out.println(chararr2);
//		
//		if(chararr1.length==chararr2.length) {
//			System.out.println("two  strings are anagram");
//		}
//		else {
//			System.out.println("two strings are not anagrams");
//		}

	}

}
