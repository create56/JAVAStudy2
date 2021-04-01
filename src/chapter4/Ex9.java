package chapter4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex9 {
	public static void main(String[] args) {
		Set<Passenger> PassengerList = new HashSet<>();
		
		Passenger p1 = new Passenger("ȫ�浿", "010-1473-3698", "���ڳ��")
		Passenger p2 = new Passenger("��ö��", "010-1598-7894", "�۽�Ʈ")
		Passenger p3 = new Passenger("����", "010-4569-1236", "����Ͻ�")
		Passenger p4 = new Passenger("������ȣ", "010-2568-2584", "�۽�Ʈ")
		Passenger p5 = new Passenger("Ȳ����", "010-7418-5296", "���ڳ��")

		PassengerList.add(p1);
		PassengerList.add(p2);
		PassengerList.add(p3);
		PassengerList.add(p4);
		PassengerList.add(p5);
		
		// Interator�� ����ؼ� ��� �°��� ������ ����ϼ���.
		Iterator<Passenger>iterator = passengerList.iterator();
		while (iterator.hasNext()) {
			Passenger passenger = iterator.next();
			
			System.out.println("�̸� : " +passenger.getName());
			System.out.println("����ó : " +passenger.getTel());
			System.out.println("�¼���� : " +passenger.getSeat());
			
		}
	}

}
