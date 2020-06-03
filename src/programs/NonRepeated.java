package programs;

// first non repeated character in a string
public class NonRepeated {
	public static void main(String[] args) {
		String str = "ABCA";
		String str1="";
		String str2="";
		String str3="";
		for(int i =0;i<str.length();i++){
			str1=str.charAt(i)+"";
			//System.out.println("str1="+str1);
			for(int j=1;j<str.length();j++){
				
				str2=str.charAt(j)+"";
				//System.out.println("str2="+str2);
				if(str1.equalsIgnoreCase(str2)){
					//str3=str1;	
						
				}else{
					str3=str1;
				}
			
				System.out.println("test="+str3);
				}
			
			}
		
		}
	}


