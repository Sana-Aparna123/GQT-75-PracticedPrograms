package strings_25_programs_project;

public class Remove_White_Spaces_From_String {

	public static void main(String[] args) {
		// 32.	Implement a Java program to remove all white spaces from a string.
		String str=" Sana Aparna ";
		
		String strNotWhiteSpaces=str.replaceAll("\\s","");
		
		System.out.println(strNotWhiteSpaces);

	}

}
