package chapter4;

import java.util.HashSet;
import java.util.Set;

public class Ex8 {
	public static void main(String[] args) {
		Set<Passenger>passengerList = new HashSet<>();
		Passenger p1 = new Passsenger("ȫ�浿", "010-7591-8524","���ڳ��");
		Passenger p2 = new Passsenger("ȫ�浿", "010-7591-8524","���ڳ��");

		
		passengerList.add(p1);
		
		p1.equals(p2.hashCode());
		// add�� �ϸ��� ������ ����ִ� �����͵��� equals �޼��带 ȣ���ϴµ�
		// �Ű������� �߰��Ϸ��� �������� �ؽð����� ����
		passengerList.add(p2);
		
		System.out.println(passengerList);
		
		PassengerList.remove(p1);
			System.out.println(PassengerList);
		iterator<Passenger> iterator = passengerList
	}

}
