package programs;

import java.util.HashMap;
import java.util.Map;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] sheetMap = { 
                {5,12,27}, 
                {500,700,300} 
                
              };
 Map<Integer, Integer> map = new HashMap<Integer, Integer>(sheetMap.length);
for (int[] mapping : sheetMap)
{
map.put(mapping[0], mapping[1]);
}

System.out.println(map);

	
	}
}
