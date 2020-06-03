package programs;
//input -nirakar panda abc
//output- abc panda nirakar
public class RevWord {
	
	public static void main(String[] args) {
		String str="Java Concept Of The Day";
		String reverseString="";
		String str1 ="Nirakar";
		System.out.println("====="+str1.substring(0,4));
		String words[]=str.split(" ");
		int len=words.length;
		for(int i=len-1;i>=0;i--){
			
			reverseString=reverseString+words[i]+" ";
		}
		System.out.println(reverseString);
	}

}
