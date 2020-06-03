package programs;

public class RecerssionPrint {
	
	public static void printNum(int number){
		if(number>0){
			System.out.println(number);
			number--;
			printNum(number);
		}
		
		
	}
	
	public static void main(String[] args) {
		printNum(10);
		
	}

}
