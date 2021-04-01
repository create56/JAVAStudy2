package chapter4;

import java.util.HashSet;
import java.util.Set;

public class Ex6 {
	public static void main(String[] args) {
		Set<Passenger>passengerList = new HashSet<E>();
		Passenger passenger1= new Passsenger("홍길동", "010-7591-8524","이코노니");
		Passenger passenger2 = new Passsenger("홍길동", "010-7591-8524","이코노니");
		
		passengerList.add(passenger1);
		passengerList.add(passenger2);
		
		System.out.println(passengerList);
		boolean same = p1.hashCode() == p2.hashCode();
 		if(same) {
			System.out.println("p1과 p2가 같습니다");
		} else {
			System.out.println("p1과 p2가 다릅니다");
		}

	}

}
