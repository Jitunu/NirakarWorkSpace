package programs;

public class Factorial {
	//factorial of 4=4*3*2*1
	public static void main(String[] args) {
		int number=4;
	int	fact=1;
		
		while(1<number){
			fact=fact*number;
			number--;
		}
		System.out.println("fact="+fact);
	}

}
