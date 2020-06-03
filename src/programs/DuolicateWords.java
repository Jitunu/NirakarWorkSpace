package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuolicateWords {
	
	//duplicate words and count of that words in string
	
	
	
	public void duplicatewords(String Givenstr){
		int count =0;
		String[] words = Givenstr.split(" ");
		Map<String,Integer> wordcount = new HashMap<String, Integer>();
		
		for(String word : words){
		
		if(wordcount.containsKey(word.toLowerCase())){
			
			wordcount.put(word.toLowerCase(), wordcount.get(word.toLowerCase())+1);
		}
		else
			  //If it is not present, put that word into wordCount with 1 as it's value
			 
            wordcount.put(word.toLowerCase(), 1);
        }

	for (String name: wordcount.keySet()){
        String key = name.toString();
        String value = wordcount.get(name).toString();  
        System.out.println(key + " " + value);  
} }
	public static void main(String[] args) {
		
		DuolicateWords duolicateWords = new DuolicateWords();
		
		duolicateWords.duplicatewords("nirakar panda is nirakar space space  panda panda");
		
	}

}
