package strings_25_programs_project;

public class String_Contains_Digits {

	public static void main(String[] args) {
		// 33.	Write a program to check if a string contains only digits.
		String str="12345";
		
		if(str.matches("\\d+")) {
			System.out.println("string contains digits");
		}
		else {
			System.out.println("string doesn't contain digits");
		}

	}

}
