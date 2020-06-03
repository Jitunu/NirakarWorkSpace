package programs;

public class SwapString {
	public static void main(String[] args) {
		
		String a="nirakar";
		
		String b="panda";
		
		a=a+b;
		System.out.println(a);
		b=a.substring(0,a.length()-b.length());
		System.out.println(b);
		a=a.substring(b.length());
		
		System.out.println(a);
		
		
	}

}
