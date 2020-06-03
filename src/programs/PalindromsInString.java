package programs;

import java.util.Arrays;

public class PalindromsInString {
	public static void main(String[] args) {

		String str = "Java Concept OfO The Day madam";
		String rev = "";
		String listPlim[]= new String[100];
		String words[] = str.split(" ");
		int len = words.length;
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
				if (reverseWord.equals(word)) {
					listPlim[listPlim.length]=reverseWord;
					System.out.println("palindrome string---" + reverseWord);
				}
			}
			System.out.println("list------++"+Arrays.toString(listPlim));
			rev = rev + reverseWord + " ";

		}
		System.out.println("final string" + rev);
	}
}
