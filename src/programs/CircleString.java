package programs;
/*Nirakar
irakarN
rakarNi
akarNir
karNira
arNirak
rNiraka
Nirakar*/
public class CircleString {
	
	public static void main(String[] args) {
		String str="Nirakar";
		
		int strlen=str.length();
		String str1="";
		String str2="";
		String finalone="";
		
		
		for(int i=0;i<=strlen;i++){
			str1=str.substring(0, i);
			//System.out.println(str1);
			str2=str.replace(str1,"");
		//	System.out.println(str2);
			finalone=str2+str1;
			System.out.println(finalone);
			
			
			
			
		}
	}

}
