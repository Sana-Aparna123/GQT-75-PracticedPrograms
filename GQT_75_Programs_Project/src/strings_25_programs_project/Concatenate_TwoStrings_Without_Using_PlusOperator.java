package strings_25_programs_project;

public class Concatenate_TwoStrings_Without_Using_PlusOperator {

	public static void main(String[] args) {
		//35.	Create a program to concatenate two strings without using the concatenation operator (+).
		       String str1="Sana";
		       String str2="Aparna";
		       
		       char[] arr=new char[str1.length()+str2.length()];
		       
		       for(int i=0;i<str1.length();i++) {
		    	   arr[i]=str1.charAt(i);
		       }
		       
		       for(int i=0;i<str2.length();i++) {
		    	   arr[str1.length()+i]=str2.charAt(i);
		       }
		       
		       String str3=new String(arr);
		       System.out.println("concatenate two strings: " +str3);

	}

}
