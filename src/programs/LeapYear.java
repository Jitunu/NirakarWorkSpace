package programs;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter years");
		Integer  s = in.nextInt();
		System.out. println("You entered string "+s);
		if(s%4==100 || s%4==0 || s%400==0){
			
			System.out.println("leap years "+s);
		}else{
			
			System.out.println("Not a leap year");
		}
			
			
		
		
	}

}
