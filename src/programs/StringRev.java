package programs;

public class StringRev {
	
	public static void main(String[] args) {
		String orginal,rev="";
		orginal="LogIn Page Class";
		int len=orginal.length();
		
		for(int i =len-1;i>=0;i--){
			rev=rev+orginal.charAt(i);
		}
		System.out.println(rev);
	}

}
