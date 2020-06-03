package programs;
//input-nirakar panda
//output-rakarin adnap
public class WordRev {
	
	public static void main(String[] args) {
		String str="Program To Reverse Each Word Of A String";
		String rev="";
		String words[] =str.split(" ");
		for(int i=0;i<words.length;i++){
			String word=words[i];
			String reverseWord="";
			for(int j=word.length()-1;j>=0;j--){
				reverseWord=reverseWord+word.charAt(j);
			}
			rev=rev+reverseWord+" ";
		}
		System.out.println(rev);
	}

}
