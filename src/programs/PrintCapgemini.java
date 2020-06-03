package programs;

public class PrintCapgemini {
	
	public static void main(String[] args) {
		
		for(int i=0;i<=50;i++){
			if(i%5==0 && i%3==0){
				System.out.println("Capgemini");
			}
			else if(i%3==0){
				System.out.println("Cap");
			}
			else if(i%5==0){
				System.out.println("Gemini");
			}
		}
	}

}
