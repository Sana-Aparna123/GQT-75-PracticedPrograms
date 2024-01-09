package strings_25_programs_project;

public class First_Letter_Word_UpperCase {

	public static void main(String[] args) {
		// 31.	Create a program to convert the first letter of each word in a sentence to uppercase.
		//or 40.Implement a Java program to capitalize the first letter of each word in a sentence.
		String strsen="this is a sample sentence";
		
		String words[]=strsen.split("\\s");
		
		StringBuilder strsen1=new StringBuilder();
		for(String word:words) {
			strsen1.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
		}
		System.out.println(strsen);
		System.out.println("After converting the first letter of each word in a sentence to uppercase:");
		System.out.println(strsen1.toString().trim());

	}

}
