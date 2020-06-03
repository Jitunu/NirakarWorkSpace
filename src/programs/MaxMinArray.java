package programs;

public class MaxMinArray {
	public static void main(String[] args) {
		
	
	int [] arr1={5,12,15,-2,-3,50,18,30,-1,-6};
	int small=arr1[0];
	int max=arr1[0];
	for(int i=0;i<arr1.length;i++){
		
		if(arr1[i]<small){
			small=arr1[i];
		}
	}
	
for(int i=0;i<arr1.length;i++){
		
		if(arr1[i]>max){
			max=arr1[i];
		}
	}
	System.out.println("small="+small);
	System.out.println("max="+max);
	
	}

}
