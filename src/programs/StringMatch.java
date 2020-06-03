package programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatch {
	
	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
		 
	      System.out.println("Enter a string");
	   String   str = in.nextLine();
	   System.out.println("You entered string "+str);
		 
	      System.out.println("Enter a string");
	   String   str2 = in.nextLine();
	      System.out.println("You entered string "+str2);
	    
	      int len = str.length();
	      int len2 = str2.length();
	      List list =new ArrayList();
	      List list2 =new ArrayList();
	      for(int i = 0; i <=len-1; i++){
	    	 if( !(list.contains(str.charAt(i)))){
	    		 list.add(str.charAt(i));
	    	 }
	      }
	      for(int i = 0; i <=len-1; i++){
		    	 if( !(list2.contains(str2.charAt(i)))){
		    		 list.add(str2.charAt(i));
		    	 }
		      }
	      
	      for (int i = 0; i <=len-1; i++) {
	    	  for (int j = 0; j <=len2-1; j++){
	    		  
	    		 
	    			  System.out.println("str="+str.charAt(i));
	    			  System.out.println("Str2="+str2.charAt(j));
	    			  if(str.charAt(i)!=str2.charAt(j)){
	    				 
	    				  System.out.println(str.charAt(i));
	    				
	    			  }else{
	    				 // System.out.println(str.charAt(i)); 
	    			  }
	    			  
	    		 
	    		  
	    	  }
		}
	      
	}

}
