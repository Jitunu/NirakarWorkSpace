package programs;

public class StringMatch2 {
	
		public static void main(String args[]){
			String str = "Heo";
			String str1 = "comeppa";
			StringBuilder sb = new StringBuilder();
			/*for (int i = 0; i < str.length(); i++) {
				if(String.valueOf(str.charAt(i)).indexOf(str1) < 0){
					sb.append(str.charAt(i));
				}
			}*/
			
			for (int i = 0; i < str.length(); i++) {
				
				for (int j = 0; j < str1.length(); j++) {
					
					if(str.charAt(i) != str1.charAt(j)){
						if(j == str1.length()-1)
						sb.append(str.charAt(i));
					} else {
						break;
					}
				}
				
			}
			
			
			System.out.println(sb.toString());
		}
	}


