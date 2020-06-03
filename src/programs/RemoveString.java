package programs;

public class RemoveString {
	
	public static void main(String[] args) {
		String str="remove any given character from a String";
		String steNew=str.replace("a", "");
		System.out.println(steNew);
		/*char str1='a';
		String newString="";
		char [] chars=str.toCharArray();
		int len=chars.length;
		for(int i=0;i<len;i++){
			System.out.println(chars[i]);
		}*/
	}

}
