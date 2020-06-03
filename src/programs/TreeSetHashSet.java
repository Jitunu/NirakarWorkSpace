package programs;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetHashSet {
	public static void main(String[] args) {
		
		HashSet<Integer> hashSet =new HashSet<Integer>();
		hashSet.add(null);
		hashSet.add(null);
		System.out.println(hashSet);
		System.out.println("----------------------");
		TreeSet<Integer> integers = new TreeSet<Integer>();
		integers.add(null);
		//integers.add(null);
		System.out.println(integers);
	}

}
