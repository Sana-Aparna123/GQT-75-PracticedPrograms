package strings_25_programs_project;

public class String_AlphanumericString {

	public static void main(String[] args) {
		// 42. Develop a Java program to check if a string is an alphanumeric string.
//		String str = "Abc123";
//		if (str.matches("[a-zA-Z0-9]+")) {
//			System.out.println(str + " is an alphanumeric String");
//		} else {
//			System.out.println(str + " is not alphanumeric String");
//		}

	//}
        String str = "Abc123";

        boolean isAlphanumeric = isAlphanumericString(str);

        if (isAlphanumeric) {
            System.out.println(str + " is an alphanumeric string.");
        } else {
            System.out.println(str + " is not an alphanumeric string.");
        }
    }

    private static boolean isAlphanumericString(String str) {
        return str.matches("[a-zA-Z0-9]+");
    }


}
