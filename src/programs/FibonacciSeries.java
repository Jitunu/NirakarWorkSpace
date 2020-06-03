package programs;

public class FibonacciSeries {
//fibonacci series =1,1,2,3,5,8........
	//addition of previous two numbers
	public static void main(String[] args) {
		/*int i=1,j=1;
		int k=1;
		//System.out.println(i+"\n"+j);
		while(k<=10){
			System.out.println(i);
			k=i+j;
			
			if(k<=10){
			i=j;
			j=k;
			
			
		}
			
			}

		*/
		int a=0,b=1,c,count=10;
		System.out.print(a+" "+b);
		for(int i=2;i<=count;i++){
			
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
		}
	}
}
