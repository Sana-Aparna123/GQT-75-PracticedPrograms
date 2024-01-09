package strings_25_programs_project;

public class Reverse_order_words {

	public static void main(String[] args) {
		//39.	Create a program to reverse the order of words in a sentence.
		String str="This is a sample Sentence";
	  
		String sentence1=reversedString(str);
		System.out.println(sentence1);

	}
	private static String reversedString(String str) {
		String words[]=str.split("\\s");
		StringBuilder reversed=new StringBuilder();
		for(int i=words.length-1;i>=0;i--) {
			reversed.append(words[i]).append(" ");
			
		}
		return reversed.toString().trim();
	}
   }
