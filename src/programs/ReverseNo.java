package programs;

public class ReverseNo {

	public static void main(String[] args) {
		/*int rev=0,number=231,temp=0;
		while(number!=0){
			temp=number%10;
				rev=rev*10+temp;
				number=number/10;
				}*/
		int rev=0,num=234,s;
		while(num>0){
			s=num%10;
			rev=rev*10+s;
			num=num/10;
		}
				
		
		System.out.println("reverse no="+rev);
	}
}
