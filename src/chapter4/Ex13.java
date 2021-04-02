package chapter4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex13 {
	public static void main(String[] args) {
		String customer1 = new Customer("010-1473-3698", "Çö±Ý");
		String customer2 = new Customer("010-1598-7894", "Ä«µå");
		String customer3 = new Customer("010-4569-1236", "Ä«µå");
		String customer4 = new Customer("010-2586-2584", "Çö±Ý");
		String customer5 = new Customer("010-7418-5296", "Çö±Ý");
		
		Map<String, String> customerList = new HashMap<>();
		customerList.put("È«±æµ¿", customer1);
		customerList.put("±èÃ¶¼ö", customer2);
		customerList.put("È«±æµ¿", customer3);
		customerList.put("È«±æµ¿", customer4);
		customerList.put("È«±æµ¿", customer5);
		
		Set<String>keySet = customerList.keySet();
		for (String key : keySet) {
			Cutomer c = customerList.get(key);
			System.out.println(c.getTel());
			System.out.println(c.getPaymentMethod());
		}
		
	
		
	}	 
		
}
