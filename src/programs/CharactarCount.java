package programs;

import java.util.HashMap;

public class CharactarCount {
	public static void main(String[] args) {
		
	
		String str ="hwmanwmm";
			HashMap<Character, Integer> map = new HashMap<>();
			for (char ch : str.toCharArray()) {
				if (map.containsKey(ch)) {
					int val = map.get(ch);
					System.out.println(val);
					map.put(ch, val + 1);
				} else {
					map.put(ch, 1);
				}
			}
			System.out.println(map);
		}
	
		/*String str ="how many time a character present in a string using java";
		String str1="";
		int count=0;
		for (int i =0;i<str.length();i++){
			str1=str.charAt(i)+"";
			for(int j=1;j<str.length();j++){
				if(str1.equals(str.charAt(j)+"")){
					count++;
				break;
				}
				
				
			}
			System.out.println(str1+"="+count);
		}
		
		
	}*/

}
