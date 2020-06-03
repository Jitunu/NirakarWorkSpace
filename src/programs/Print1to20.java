package programs;

public class Print1to20 {
	public static void main(String[] args) {
		for(int i=1;i<=20;i++){
			
			if(i%3==0){
				System.out.print("#");
			}else{
				System.out.print(i);
			}
		}
	}

}
