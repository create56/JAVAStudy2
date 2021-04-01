package chapter4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex5 {
	public static void main(String[] args) {
		List<Integer>list = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		
		Iterator<Integer> it =	list.iterator();
		
		while(it.hasNext()) {
			int num = it.next();
			Integer num2 =it.next();
			
			System.out.println(it.hasNext());
			
			
		}
		
	}

}
