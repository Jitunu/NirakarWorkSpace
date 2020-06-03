package programs;

public class Test2 implements Test3{
	
	static  int i=20;
	 void a(){
		 System.out.println(i); 
	 }
	 
	
	
	public static void main(String[] args) {
		System.out.println(i);
		Test2 test2 = new Test2();
		test2.a();
	}

	@Override
	public int mobile() {
		// TODO Auto-generated method stub
		return 0;
	}
}
