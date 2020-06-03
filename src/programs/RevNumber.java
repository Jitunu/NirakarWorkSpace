package programs;

public class RevNumber {
	
	public static void main(String[] args) {
		  int r,rev=0,temp;    
		  int n=4546;//It is the number variable to be checked for palindrome  
		  
		  temp=n;
		  double a=.05/10;
		  System.out.println(a);
		  while(n>0){    
		   r=n%10;  
		   rev=(rev*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==rev)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");   
	}
	
	
	

}
