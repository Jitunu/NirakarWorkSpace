package programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class duplicateInArrayList {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		 strings.add("stack");
		 strings.add("stack");
		 strings.add("panda");
		 strings.add("stack");
		 strings.add("panda");

		Map<String, Integer> counts = new HashMap<String, Integer>();

		for (String str : strings) {
			//System.out.println(counts.get(str));
		    if (counts.containsKey(str)) {
		        counts.put(str, counts.get(str) + 1);
		    } else {
		        counts.put(str, 1);
		    }
		}

		for (Map.Entry<String, Integer> entry : counts.entrySet()) {
		    System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}

}
