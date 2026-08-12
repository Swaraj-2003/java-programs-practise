package Day27;

public class Day27 {
	public static boolean checkPalindrome(String name) {

		if (name.length() == 0 || name == null) {
			System.out.println("Invalid String");
		}

		name = name.toLowerCase();
		name = name.replaceAll("[^A-Za-z0-9]", "");

		char ch[] = name.toCharArray();
		int i = 0;
		int j = ch.length - 1;
		while (i <= j) {
			if (ch[i] != ch[j]) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static String findLargestWord() {
		String sentence = "Virat plays cricket for Rcb";
		String[] words = sentence.split(" ");
		System.out.println(words.length);
		int largestWordCount = 0;
		String largestWordString = "";

		for (String word : words) {
			if (word.length() > largestWordCount) {
				largestWordCount = word.length();
				largestWordString = word;
			}
		}

		return largestWordString;
	}

	public static void main(String[] args) {
//		String ans = findLargestWord();
//		System.out.println(ans);
//		if (checkPalindrome()) {
//			System.out.println("the string is palindrome");
//		} else {
//			System.out.println("the string is not palindrome");
//		}
		String name = "A man, A Plan A Canal : Panama1";
		System.out.println(name);
		System.out.println(checkPalindrome(name) ? "the string is palindrome" : "the string is not palindrome");
	}
}
