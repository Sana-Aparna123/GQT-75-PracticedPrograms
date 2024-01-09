package strings_25_programs_project;

import java.util.HashSet;
import java.util.Set;

public class Longest_Substring {

	public static void main(String[] args) {
		// 29.	Write a Java program to find the length of the longest substring without repeating characters.
      String str="abcabcbb";
      Set<Character> uniquechar=new HashSet<>();
      int maxlen=0;
      int i=0;
      int j=0;
      while(j<str.length()) {
      if(!uniquechar.contains(str.charAt(j))){
    	  uniquechar.add(str.charAt(j));
    	  maxlen=Math.max(maxlen, j-i+1);
    	  j++;
    	  }
      else {
    	  uniquechar.remove(str.charAt(i));
    	  i++;
    	  
         }
      }
      System.out.println("Longest Substring length:" + maxlen);
      
	}

}
