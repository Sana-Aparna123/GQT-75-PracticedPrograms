package strings_25_programs_project;

public class Vowel_Consonent_Count_In_Strings {

	public static void main(String[] args) {
		//28.	Implement a program to count the number of vowels and consonants in a string.
		String str="Sana Aparna";
		str=str.toLowerCase();
		System.out.println(str);
		int vowelCount=0;
		int consonantCount=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z' ) {
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					vowelCount++;
				}
				else {
					consonantCount++;
				}
			}
			
		}
		System.out.println("the number of vowels:" +vowelCount);
		System.out.println("the number of consonents:" + consonantCount);
		

	}

}
