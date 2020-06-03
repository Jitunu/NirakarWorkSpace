package programs;



/*
012345
01234
0123
012
01
0
*/
public class Patteren_Print {
	
	public static void main(String[] args) {
		
		for(int i=5;i>=0;i--){
			for(int j=0;i>=j;j++){
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
