package chapter4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class Ex2 {
	public static void main(String[] args) {
		// ArrayList, LinkedList ,stack, vector ��
		// �������� �°� ����Ʈ �ۼ������ϱ�
		// ArrayList Ư¡ - �߰��� ����, ������ ����� ��Ȳ������ �������� �ڷᱸ��
		//              �ǵڿ��� ���� ������ ����� ��Ȳ������ ������ �ڷᱸ��
		List<Passenger> passengerList = new ArrayList<>();
		
		
		
		List<String> arrayList = new ArrayList<>();
		arrayList = new LinkedList<>();
		arrayList.add("A");
		arrayList.add("C");
		arrayList.add("E");
		arrayList.add("D");
		System.out.println("�ʱ� ���� :" + arrayList);
		
		arrayList.add(1,"B");
		System.out.println("�ε���1��ġ�� B�߰� :" +arrayList);
		
		arrayList.add(3,"D");
		System.out.println("�ε���3��ġ�� D�߰� :" +arrayList);
		
		arrayList.remove(2);
		System.out.println("�ε���2��ġ�� �� ���� :" +arrayList);
		
		arrayList.remove(4);
		System.out.println("�ε���4��ġ�� �� ���� :" +arrayList);
		                   
		System.out.println("�ε���2��ġ�� �� ��ȯ :" +arrayList.get(2));	
		System.out.println("�ε���3��ġ�� �� ��ȯ :" +arrayList.get(3));	
	}
	
}


	
