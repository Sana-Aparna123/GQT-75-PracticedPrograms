package strings_25_programs_project;

import java.util.HashSet;
import java.util.Set;

public class Common_Characters_Between_Two_Strings {

	public static void main(String[] args) {
		// 44. Implement a program to find the common characters between two strings.
		Set<Character> common = new HashSet<Character>();
		String str1 = "Hello";
		String str2 = "World";
		String str3 = new String();
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					common.add(str1.charAt(i));
					common.add(str2.charAt(j));

				}
			}
		}
//		StringBuilder str=new StringBuilder();
//		   System.out.println(str.append(common).toString());
		
		System.out.println(common);
		   

	}

}
