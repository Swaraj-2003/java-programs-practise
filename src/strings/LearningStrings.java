package strings;

public class LearningStrings {

	public static boolean checkPalindrome(String name) {
		if (name == null || name.length() == 0) {
			System.out.println("Invalid String");
		}
		name = name.toLowerCase().replaceAll("[^A-Za-z]", "");
		int start = 0;
		int end = name.length() - 1;
		while (start <= end) {
			if (name.charAt(start) != name.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	static String reverseString(String name) {
		if (name == null || name.length() == 0) {
			System.out.println("Invalid String");
		}
		name = name.toLowerCase().replaceAll("[^A-Za-z]", "");
		String reverString = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			reverString += name.charAt(i);
		}
		return reverString;
	}

	public static int countCharacters(String name) {
		name = name.replaceAll(" ", "");
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			count++;
		}

		return count;

	}

	public static int countVowels(String name) {
		name = name.toLowerCase();
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}

		return count;

	}

	public static int countCharFreq(String name, char ch) {
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (c == ch) {
				count++;
			}
		}

		return count;

	}

	public static int countWords(String name) {
		name = name.trim();
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch == ' ') {
				count++;
			}
		}
		return ++count;

	}

	public static void main(String[] args) {
//		String name = "nitin123!";
//		String ans = reverseString(name);
//		if (name.equals(ans)) {
//			System.out.println("the string is palindrome");
//		} else {
//			System.out.println("the string is not palindrome");
//		}
//		String name = "nitin";
//		boolean ans = checkPalindrome(name);
//		System.out.println(ans ? "the string is palindrome" : "the string is not palindrome");

//		String name = "sanket ingale";
//		int ans = countCharacters(name);
//		System.out.println("the " + name + " has " + ans + " characters");

//		String name = "sanket ingale";
//		int ans = countVowels(name);
//		System.out.println(ans);

//		String name = "programming";
//		char ch = 'k';
//		int ans = countCharFreq(name, ch);
//		System.out.println(ans);

		String name = "java is easy when DSA is not included";
		int ans = countWords(name);
		System.out.println(ans);
	}

}
