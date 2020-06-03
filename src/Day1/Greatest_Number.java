package Day1;

public class Greatest_Number {
	
	public static void main(String[] args) {
		
		int a=99,b=125,c=89;
		int max;
		
		if(a>b && a>c){
			
			max=a;
			
		}else if (b>c){
			max=b;
		}
		else {
			max =c;
		}
		System.out.println("Max Value ="+max);
	}

}
