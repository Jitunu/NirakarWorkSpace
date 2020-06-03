package programs;

import java.util.Scanner;

public class CompareString {
	
	public static void main(String[] args) {
		
		String s1, s2;
	      Scanner in = new Scanner(System.in);
	     
	      System.out.println("Enter the first string");
	      s1 = in.nextLine();
	     
	      System.out.println("Enter the second string");
	      s2 = in.nextLine();
	      System.out.println(s1.compareTo(s2));
	      if(s1.compareTo(s2)>0)
	    	  System.out.println("The first string is smaller than the second.");
	      else if (s1.compareTo(s2) < 0)
	         System.out.println("The first string is greater than the second.");
	      else  
	         System.out.println("Both the strings are equal.");
	   }
	      
	      {
	}

}
