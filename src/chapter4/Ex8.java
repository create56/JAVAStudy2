package chapter4;

import java.util.HashSet;
import java.util.Set;

public class Ex8 {
	public static void main(String[] args) {
		Set<Passenger>passengerList = new HashSet<>();
		Passenger p1 = new Passsenger("홍길동", "010-7591-8524","이코노니");
		Passenger p2 = new Passsenger("홍길동", "010-7591-8524","이코노니");

		
		passengerList.add(p1);
		
		p1.equals(p2.hashCode());
		// add를 하면은 기존에 들어있는 데이터들의 equals 메서드를 호출하는데
		// 매개변수는 추가하려는 데이터의 해시값으로 전달
		passengerList.add(p2);
		
		System.out.println(passengerList);
		
		PassengerList.remove(p1);
			System.out.println(PassengerList);
		iterator<Passenger> iterator = passengerList
	}

}
