package programs;

public class StaticKey {
	
	static{
		
		System.out.println("static block");
	}

	static void peintV(){
		
		System.out.println("static method");
	}
	
	void Nonstatic(){
		
		System.out.println("non static method");
	}
	
	public static void main(String[] args) {
		StaticKey.peintV();
		StaticKey key = new StaticKey();
		key.Nonstatic();
	
	}
}
