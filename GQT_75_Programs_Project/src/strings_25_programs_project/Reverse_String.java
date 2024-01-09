package strings_25_programs_project;

public class Reverse_String {

	public static void main(String[] args) {
		// 26.	Write a Java program to reverse a string.
	     String s1="Hello World!";
	     StringBuilder reverse=new StringBuilder();
	     
	     for(int i=s1.length()-1;i>=0;i--) {
	    	 reverse.append(s1.charAt(i));
	     }
	     System.out.println(s1);
	     System.out.println(reverse);

	}

}
