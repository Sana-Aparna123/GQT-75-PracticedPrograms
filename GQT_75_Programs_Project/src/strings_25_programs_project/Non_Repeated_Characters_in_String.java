package strings_25_programs_project;

import java.util.ArrayList;
import java.util.List;

public class Non_Repeated_Characters_in_String {

	public static void main(String[] args) {
		// 37.	Write a Java program to find the first non-repeated character in a string.
		String str="programming";
		List<Character> str1=new ArrayList<Character>();
		
//		for(int i=0;i<str.length();i++) {
//			int count=1;
//			if(str.charAt(i)=='A') {
//				continue;
//			}
//			for(int j=i+1;j<str.length();j++) {
//				char ch=str.charAt(i);
//				if(str.charAt(j)==ch) {
//					count++;
//					ch='A';
//				}
//				
//		}
//		if(count==1) {
//			str1.add(str.charAt(i));
//		}	
//	}
	System.out.println(str1);
    
		
		
		

	}

}
