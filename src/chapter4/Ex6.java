package chapter4;

import java.util.HashSet;
import java.util.Set;

public class Ex6 {
	public static void main(String[] args) {
		Set<Passenger>passengerList = new HashSet<E>();
		Passenger passenger1= new Passsenger("ȫ�浿", "010-7591-8524","���ڳ��");
		Passenger passenger2 = new Passsenger("ȫ�浿", "010-7591-8524","���ڳ��");
		
		passengerList.add(passenger1);
		passengerList.add(passenger2);
		
		System.out.println(passengerList);
		boolean same = p1.hashCode() == p2.hashCode();
 		if(same) {
			System.out.println("p1�� p2�� �����ϴ�");
		} else {
			System.out.println("p1�� p2�� �ٸ��ϴ�");
		}

	}

}
