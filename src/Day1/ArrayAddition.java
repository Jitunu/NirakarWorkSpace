package Day1;

public class ArrayAddition {
	public static void main(String[] args) {
		
		int values[] ={1,3,6,2,1};
		
		int size =values.length;
		int sum = 0;
		
		for(int i=0;i<size;i++){
			sum=sum+values[i];
			
		}
		System.out.println(sum);
	}

}
