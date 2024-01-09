package strings_25_programs_project;

public class Second_Most_Frequent_Charcater {

	public static void main(String[] args) {
		// 46.	Develop a program to find the second most frequent character in a string.
		String str = "SanaAparna";
		int freq[] = new int[str.length()];
		int count=1;
		for (int i = 0; i < str.length(); i++) {
			 count = 1;
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
				if(count==freq[i]/2 ) {
				System.out.println(str.charAt(i) + " repeats " + freq[i] + " times");
				}
				
			}
		}


	}

}
