package strings_25_programs_project;

public class Most_Frequent_Characters_in_string {

	public static void main(String[] args) {
		// 34. Develop a Java program to find the most frequent character in a string.
		String str = "programming";
		int freq[] = new int[str.length()];
         
		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
					freq[j] = -1;
				}
			}
			if (freq[i] != -1) {
				freq[i] = count;

			}
		}
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] != -1) {
				System.out.println(str.charAt(i) + " repeats " + freq[i] + " times");
			}
		}
		

	}

}
