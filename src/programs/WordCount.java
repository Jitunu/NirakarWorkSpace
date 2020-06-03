package programs;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
	public static void main(String[] args) {
		String inputString = "Super Man Bat Man Spider Man"; 
		String[] words = inputString.split(" ");
		
		 Map<String, Integer> wordCount = new HashMap<String, Integer>();
		 
	        //Checking each word
	 
	        for (String word : words)
	        {
	            //whether it is present in wordCount
	  Integer count = wordCount.get(word);
	            if(count == null)
	            {
	                //If it is present, incrementing it's count by 1
	 
	                wordCount.put(word,1);
	            }
	            else
	            {
	                //If it is not present, put that word into wordCount with 1 as it's value
	 
	                wordCount.put(word,count+1);
	            }
	        }
	        System.out.println(wordCount);
	}

}
