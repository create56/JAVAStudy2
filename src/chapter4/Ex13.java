package chapter4;

import java.util.HashMap;
import java.util.Map;

public class Ex13 {
	public static void main(String[] args) {
		String customer1 = new Customer("010-1473-3698", "����");
		String customer2 = new Customer("010-1598-7894", "ī��");
		String customer3 = new Customer("010-4569-1236", "ī��");
		String customer4 = new Customer("010-2586-2584", "����");
		String customer5 = new Customer("010-7418-5296", "����");
		
		Map<String, String> customerList = new HashMap<>();
		customerList.put("ȫ�浿", customer1);
		customerList.put("��ö��", customer2);
		customerList.put("ȫ�浿", customer3);
		customerList.put("ȫ�浿", customer4);
		customerList.put("ȫ�浿", customer5);
	}	
		
}
