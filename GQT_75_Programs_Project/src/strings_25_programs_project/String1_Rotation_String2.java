package strings_25_programs_project;

public class String1_Rotation_String2 {

	public static void main(String[] args) {
		// 41. Write a program to check if a string is a rotation of another string.
//		String str1 = "waterbottle";
//		String str2 = "erbottlewat";
//		boolean res =true;
//		if (str1.length() != str2.length()) {
//			res=false;
//		} else {
//			String concat = str1 + str1;
//		    concat.contains(str2);
//		    
//		}  
//		
//
//		if (res) {
//			System.out.println(str2 + " rotation of " + str1);
//		} else {
//			System.out.println(str2 + " not rotation of " + str1);
//		}
//        

		String str1 = "waterbottle";
		String str2 = "erbottlewas";

		boolean rotation = StringRotation(str1, str2);
		if (rotation) {
			System.out.println(str2 + " is a rotation of" + str1);
		} else {
			System.out.println(str2 + " is not a rotation of" + str1);
		}
	}

	private static boolean StringRotation(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		String concat = str1 + str1;
		return concat.contains(str2);

	}

}
