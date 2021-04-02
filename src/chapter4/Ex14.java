package chapter4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex14 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());	
		}
		// foreach
		// 향상된 for문
		for (Integer i : set) {
			System.out.println(i);
		}
		
		Set<String>

	}

}
