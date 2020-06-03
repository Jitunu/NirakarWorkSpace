package programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StoreCharacterWise {
	//input=abccdedceabc
	//output=aabccccddee
	
	public static void main(String[] args) {
		String str = "abccdedceabc";
		char[] stringtoArray =str.toCharArray();
		System.out.println(stringtoArray);
		Arrays.sort(stringtoArray);
		System.out.println("Sorted string " + String.valueOf(stringtoArray));
		/*List unsortedList = Arrays.asList(stringtoArray);
		Collections.sort(unsortedList, Collections.reverseOrder());
		System.out.println("Arraylist in descending order: " + String.valueOf(unsortedList));
*/

	}

}
