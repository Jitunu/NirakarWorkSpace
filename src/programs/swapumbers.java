package programs;

public class swapumbers {
	{
		int test=10;
		System.out.println(test);
	}
	
	static{
		
		System.out.println("static block");
	}
	public static void main(String[] args) {
		
	
	int a=5,b=6;
	int c;
	
	//without using 3rd variable
	/*a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a);
	System.out.println(b);
	System.out.println("================");*/
	
//using 3rd variable	
	c=b;
	b=a;
	a=c;
	System.out.println(b);
	System.out.println(a);
	
	
	}
	

}
