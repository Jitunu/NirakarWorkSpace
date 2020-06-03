package programs;

public class AbstaractClassTest extends AbstractClass {

	@Override
	public void draw() {
		System.out.println("draw the circle");
		
	}

	
	public static void main(String[] args) {
		
		AbstaractClassTest abstaractClassTest = new AbstaractClassTest();
		abstaractClassTest.paint();
	}


	@Override
	public void draw(int i) {
		// TODO Auto-generated method stub
		
	}
}
