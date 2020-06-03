package programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateCharacter {
	public static void main(String[] args) {
		String str="Nirakar Panda";
		
		String vl="23451233457890";
		int ct=vl.length();
		
		for(int i=ct-5;i<=ct-1;i++){
			
			System.out.print(vl.charAt(i));
		}
		
		List list=new ArrayList();
		int len=str.length();
		for(int i=0;i<=len-1;i++){
			//System.out.println(str.charAt(i));
			//list.add(str.charAt(i));
			if(!(list.contains(str.charAt(i)))){
				
				list.add(str.charAt(i));
				
				
			}else{
				Set set =new HashSet();
				set.add(str.charAt(i));
				System.out.println("\n duplicate="+set);
			}
					
		}
		
	}

}
